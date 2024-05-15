package dev.Anka.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }


    @GetMapping
    public String home() {
        return "Hello, JWT";
    }
}
