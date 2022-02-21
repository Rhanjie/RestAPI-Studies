package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ujd.spicegirls.RestAPIStudies.models.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
}
