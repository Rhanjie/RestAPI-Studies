package ujd.spicegirls.RestAPIStudies.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import ujd.spicegirls.RestAPIStudies.controllers.dtos.GenreDto;
import ujd.spicegirls.RestAPIStudies.models.Book;
import ujd.spicegirls.RestAPIStudies.models.Genre;
import ujd.spicegirls.RestAPIStudies.services.GenreService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TypeController {
    private final GenreService genreService;

    @GetMapping("/genres")
    public List<GenreDto> getBookGenres(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = (page != null) ? Math.abs(page) : 0;
        Sort.Direction sortDirection = (sort != null) ? sort : Sort.Direction.ASC;

        return TypeDtoMapper.mapToTypeDtos(genreService.getBookGenres(pageNumber, sortDirection));
    }

    @GetMapping("/genres/books")
    public List<Genre> getGenresWithBooks(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = (page != null) ? Math.abs(page) : 0;
        Sort.Direction sortDirection = (sort != null) ? sort : Sort.Direction.ASC;

        return genreService.getGenresWithBooks(pageNumber, sortDirection);
    }

    @GetMapping("/genres/{id}")
    public Genre getSingleEquipmentType(@PathVariable long id) {
        return genreService.getSingleEquipmentType(id);
    }

    @PostMapping("/genres")
    public Genre createEquipmentType(@RequestBody Genre genre) {
        return genreService.createEquipmentType(genre);
    }

    @PostMapping("/genres/books")
    public Book createEquipment(@RequestBody Book book) {
        return genreService.createEquipment(book);
    }

    @PutMapping("/genres")
    public Genre updateEquipmentType(@RequestBody Genre genre) {
        return genreService.updateEquipmentType(genre);
    }

    @PutMapping("/genres/books")
    public Book updateEquipment(@RequestBody Book book) {
        return genreService.updateEquipment(book);
    }

    @DeleteMapping("/genres/{id}")
    public void deleteEquipmentType(@PathVariable long id) {
        genreService.deleteEquipmentType(id);
    }

    @DeleteMapping("/genres/books/{id}")
    public void deleteEquipment(@PathVariable long id) {
        genreService.deleteEquipment(id);
    }
}

