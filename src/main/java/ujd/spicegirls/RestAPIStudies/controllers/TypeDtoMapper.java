package ujd.spicegirls.RestAPIStudies.controllers;

import ujd.spicegirls.RestAPIStudies.controllers.dtos.TypeDto;
import ujd.spicegirls.RestAPIStudies.models.Genre;

import java.util.List;
import java.util.stream.Collectors;

public class TypeDtoMapper {
    private TypeDtoMapper() {
        //Prohibit the creation af the class object
    }

    public static List<TypeDto> mapToTypeDtos(List<Genre> genres) {
        return genres.stream()
                .map(TypeDtoMapper::mapToTypeDto)
                .collect(Collectors.toList());
    }

    public static TypeDto mapToTypeDto(Genre genre) {
        return TypeDto.builder()
                .id(genre.getId())
                .name(genre.getName())
                .weight(genre.getWeight())
                .build();
    }
}
