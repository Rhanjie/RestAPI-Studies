package ujd.spicegirls.RestAPIStudies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ujd.spicegirls.RestAPIStudies.models.User;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers() {
        return null;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable long id) {
        return null;
    }
}
