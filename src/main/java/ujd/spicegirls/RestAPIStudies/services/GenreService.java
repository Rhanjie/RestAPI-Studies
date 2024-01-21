package ujd.spicegirls.RestAPIStudies.services;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ujd.spicegirls.RestAPIStudies.models.Book;
import ujd.spicegirls.RestAPIStudies.models.Genre;
import ujd.spicegirls.RestAPIStudies.repositories.BookRepository;
import ujd.spicegirls.RestAPIStudies.repositories.GenreRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GenreService {
    private final GenreRepository genreRepository;
    private final BookRepository bookRepository;

    private static final int PAGE_SIZE = 5;

    @Cacheable(cacheNames = "BookGenres")
    public List<Genre> getBookGenres(int page, Sort.Direction sort) {
        return genreRepository.findAllGenres(PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
    }

    @Cacheable(cacheNames = "GenresWithBooks")
    public List<Genre> getGenresWithBooks(int page, Sort.Direction sort) {
        var genres = genreRepository.findAllGenres(PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
        var ids = genres.stream()
                .map(Genre::getId)
                .collect(Collectors.toList());

        var books = bookRepository.findAllByIdGenreIn(ids);
        genres.forEach(user -> user.setBooks(extractBook(books, user.getId())));

        return genres;
    }

    @Cacheable(cacheNames = "SingleEquipmentType")
    public Genre getSingleBookGenre(long id) {
        return genreRepository.findById(id)
                .orElseThrow();
    }

    private List<Book> extractBook(List<Book> books, long id) {
        return books.stream()
                .filter(book -> book.getIdGenre() == id)
                .collect(Collectors.toList());
    }

    public Genre createBookGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Transactional
    public Genre updateBookGenre(Genre genre) {
        Genre updatingGenre = genreRepository.findById(genre.getId()).orElseThrow();

        updatingGenre.setName(genre.getName());
        updatingGenre.setOnlyForAdults(genre.getOnlyForAdults());

        return updatingGenre;
    }

    @Transactional
    public Book updateBook(Book book) {
        Book updatingBook = bookRepository.findById(book.getId()).orElseThrow();

        updatingBook.setIdGenre(book.getIdGenre());
        updatingBook.setTitle(book.getTitle());
        updatingBook.setAuthor(book.getAuthor());
        updatingBook.setPublisher(book.getPublisher());
        updatingBook.setYear(book.getYear());
        updatingBook.setCondition(book.getCondition());

        return updatingBook;
    }

    public void deleteBookGenre(long id) {
        genreRepository.deleteById(id);
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}

