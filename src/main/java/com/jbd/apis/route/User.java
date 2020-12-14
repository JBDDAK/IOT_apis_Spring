package com.jbd.apis.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @GetMapping("/user")
        public String getUsers(){
            return "users!";
        }
}
