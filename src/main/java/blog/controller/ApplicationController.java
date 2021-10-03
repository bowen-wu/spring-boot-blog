package blog.controller;

import blog.entity.User;
import blog.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class ApplicationController {
    private final UserService userService;

    @Inject
    public ApplicationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return this.userService.getAllUser();
    }
}
