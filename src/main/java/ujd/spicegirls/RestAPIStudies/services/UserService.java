package ujd.spicegirls.RestAPIStudies.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getSingleUser(long id) {
        return userRepository.findById(id)
                .orElseThrow();
    }
}
