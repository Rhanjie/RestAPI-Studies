package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ujd.spicegirls.RestAPIStudies.models.Type;

import java.util.List;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
    @Query("Select p From Type p")
    List<Type> findAllTypes(Pageable page);
}
