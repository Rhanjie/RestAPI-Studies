package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ujd.spicegirls.RestAPIStudies.models.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("Select p From User p")
    List<User> findAllUsers(Pageable page);
}
