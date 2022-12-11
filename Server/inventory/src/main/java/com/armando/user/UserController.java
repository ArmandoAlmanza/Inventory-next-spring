package com.armando.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public GreetResponse greet() {
        return new GreetResponse("Welcome to the user List");
    }

    record GreetResponse(String greet) {
    }
}
