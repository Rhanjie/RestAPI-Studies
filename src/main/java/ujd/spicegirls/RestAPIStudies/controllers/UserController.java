package ujd.spicegirls.RestAPIStudies.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import ujd.spicegirls.RestAPIStudies.controllers.dtos.UserDto;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.services.UserService;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<UserDto> getUsers(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = (page != null) ? Math.abs(page) : 0;
        Sort.Direction sortDirection = (sort != null) ? sort : Sort.Direction.ASC;

        return UserDtoMapper.mapToUserDtos(userService.getUsers(pageNumber, sortDirection));
    }

    @GetMapping("/users/payments")
    public List<User> getUsersWithPayments(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = (page != null) ? Math.abs(page) : 0;
        Sort.Direction sortDirection = (sort != null) ? sort : Sort.Direction.ASC;

        return userService.getUsersWithPayments(pageNumber, sortDirection);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getSingleUser(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
