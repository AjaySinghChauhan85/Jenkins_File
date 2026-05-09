// package com.springhow.example;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class HelloController {

//     @GetMapping("/")
//     public String hello() {
//         return "Hello India";
//     }
// }

package com.springhow.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
