package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chris Bay
 */
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

//     Handles requests of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public static String createMessage(@RequestParam String name, @RequestParam String language) {
        return language + " " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

//    @GetMapping("{name}/{language}")
//    public static String createMessage(@PathVariable String name, @PathVariable String language) {
//        return language + name + "!";
//    }




    // /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                    "<form action = '/hello' method = 'post'>" + // submit a request to /hello
                        "<input type = 'text' name = 'name' >" +
                            "<select name='language'>" +
                                "<option value='hello' id='english'>English</option>" +
                                    "<label for='english'>English</label>" +
                                "<option value='Bonjour' id='french'</option>" +
                                    "<label for='french'>French</label>" +
                                "<option value='Hola' id='spanish'</option>" +
                                    "<label for='spanish'>Spanish</label>" +
                                "<option value='Ola' id='portuguese'</option>" +
                                    "<label for='portuguese'>Portuguese</label>" +
                                "<option value='Bruchim Habayim' id='hebrew'</option>" +
                                    "<label for='hebrew'>Hebrew</label>" +
                            "</select>" +
                        "<input type = 'submit' value = 'Greet Me!' >" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

}



















































//package org.launchcode.hellospring.controllers;
//
//
//import org.apache.coyote.Request;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class HelloController {
//
//
//
//    //if want to handle request at path /hello, add info to getmapping
//    //basically sitemapping + corresponding url
//
//    //add annotation to make this a request handler
////    @GetMapping("hello")    //method should accept get requests
////    @ResponseBody  //basic way to signal method will return basic text response
////    public String hello() {
////        return "Hello, Spring!";
////    }
//
//
//    @GetMapping("goodbye")    //method should accept get requests
//    @ResponseBody  //basic way to signal method will return basic text response
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//
//    @RequestMapping(value="hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST})
//    public String hellogoodbye() {
//        return "Hello Goodbye";
//    }
//
//
//
//
//
//    //create a handler that handles request of form /hello?name=LaunchCode
//
//    /*@RequestParam inside helloWithQueryParam tells spring that the method
//    expects a request/query parameter called name (name as parameter must
//    mesh up with name in URL
//     */
//    //makes method dynamic
////    @GetMapping("hello") //will be only available with /hello
//////    @PostMapping("hello")  -- you might think this would work to add post method
//////    /streamline with below HTML method, but it doesn't! Instead, use method below
////    @ResponseBody
////    public String helloWithQueryParam(@RequestParam String name) {
////        return "Hello " + name + "!";
////    }
//
//
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
//    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello " + name + "!";
//    }
//
//
//
//
//
//    //Handles requests of the form /hello/LaunchCode
//    //the data (variable) is now part of the path, instead of query string
//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello " + name + "!";
//    }
//
//
//    //because we're unlikely to submit data via URL query string
//    //more likely to do so with a form or other method
//    @GetMapping("form")
//    @ResponseBody
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" + //submits request to /hello (need previous method)
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
//
//
//
//
//
//}
