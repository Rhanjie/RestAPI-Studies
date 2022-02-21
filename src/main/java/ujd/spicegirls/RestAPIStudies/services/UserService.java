package ujd.spicegirls.RestAPIStudies.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    private static final int PAGE_SIZE = 5;

    public List<User> getUsers(int page) {
        return userRepository.findAllUsers(PageRequest.of(page, PAGE_SIZE));
    }

    public User getSingleUser(long id) {
        return userRepository.findById(id)
                .orElseThrow();
    }
}
