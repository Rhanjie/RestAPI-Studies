package ujd.spicegirls.RestAPIStudies.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ujd.spicegirls.RestAPIStudies.controllers.dtos.UserDto;
import ujd.spicegirls.RestAPIStudies.models.Payment;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.repositories.PaymentRepository;
import ujd.spicegirls.RestAPIStudies.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PaymentRepository paymentRepository;

    private static final int PAGE_SIZE = 5;

    public List<User> getUsers(int page) {
        return userRepository.findAllUsers(PageRequest.of(page, PAGE_SIZE));
    }

    public List<User> getUsersWithPayments(int page) {
        var users = userRepository.findAllUsers(PageRequest.of(page, PAGE_SIZE));
        var ids = users.stream()
                .map(User::getId)
                .collect(Collectors.toList());

        var payments = paymentRepository.findAllByIdUserIn(ids);
        users.forEach(user -> user.setPayments(extractPayments(payments, user.getId())));

        return users;
    }

    public User getSingleUser(long id) {
        return userRepository.findById(id)
                .orElseThrow();
    }

    private List<Payment> extractPayments(List<Payment> payments, long id) {
        return payments.stream()
                .filter(payment -> payment.getIdUser() == id)
                .collect(Collectors.toList());
    }
}
