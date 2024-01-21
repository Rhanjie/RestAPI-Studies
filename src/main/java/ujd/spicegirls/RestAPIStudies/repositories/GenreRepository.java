package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ujd.spicegirls.RestAPIStudies.models.Genre;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    @Query("Select p From Type p")
    List<Genre> findAllGenres(Pageable page);
}
