package ujd.spicegirls.RestAPIStudies.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ujd.spicegirls.RestAPIStudies.controllers.dtos.UserDto;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.services.UserService;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<UserDto> getUsers(@RequestParam(required = false) int page) {
        return UserDtoMapper.mapToUserDtos(userService.getUsers(Math.abs(page)));
    }

    @GetMapping("/users/payments")
    public List<User> getUsersWithPayments(@RequestParam(required = false) int page) {
        return userService.getUsersWithPayments(Math.abs(page));
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getSingleUser(id);
    }
}
