package ujd.spicegirls.RestAPIStudies.controllers;

import ujd.spicegirls.RestAPIStudies.controllers.dtos.GenreDto;
import ujd.spicegirls.RestAPIStudies.models.Genre;

import java.util.List;
import java.util.stream.Collectors;

public class GenreDtoMapper {
    private GenreDtoMapper() {
        //Prohibit the creation af the class object
    }

    public static List<GenreDto> mapToGenreDtos(List<Genre> genres) {
        return genres.stream()
                .map(GenreDtoMapper::mapToGenreDto)
                .collect(Collectors.toList());
    }

    public static GenreDto mapToGenreDto(Genre genre) {
        return GenreDto.builder()
                .id(genre.getId())
                .name(genre.getName())
                .onlyForAdults(genre.getOnlyForAdults())
                .build();
    }
}
