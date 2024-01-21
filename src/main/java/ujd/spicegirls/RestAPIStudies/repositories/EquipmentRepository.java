package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ujd.spicegirls.RestAPIStudies.models.Book;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByIdTypeIn(List<Long> ids);
}
