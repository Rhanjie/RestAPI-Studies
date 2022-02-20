package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ujd.spicegirls.RestAPIStudies.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
