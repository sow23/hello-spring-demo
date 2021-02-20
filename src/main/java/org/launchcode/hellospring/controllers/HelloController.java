package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloController {
    //Handles request at /hello
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello! Spring!!";
   }
    //Handles request at /goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye Satya!!!";
    }



//  responds  request of the form /world?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "world")
    @ResponseBody
    public String helloWithQueryParams(@RequestParam String name){
        return  "hello "+name + "!";
    }


   //Handles a request of the form hello/LaunchCode
    //it accepts a piece of data in the path here it is "name"
   @GetMapping("hello/{name}")
   @ResponseBody
   public String helloWithPathParam(@PathVariable String name){
        return "Hello ," + name + "path parameters!";
   }


   @GetMapping("form")
   @ResponseBody
   public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action = 'world' method = 'post'>" + //submits a request /hello
                "<input type = 'text' name = 'name'>" +
                "<input type = 'submit' value = 'Greet me!!'>" +
                "</form>" +
                "</body>" +
                "</html>" ;

   }


}
