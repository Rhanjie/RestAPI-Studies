package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ujd.spicegirls.RestAPIStudies.models.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByIdGenreIn(List<Long> ids);
}
