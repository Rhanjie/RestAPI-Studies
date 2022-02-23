package ujd.spicegirls.RestAPIStudies.controllers;

import ujd.spicegirls.RestAPIStudies.controllers.dtos.TypeDto;
import ujd.spicegirls.RestAPIStudies.controllers.dtos.UserDto;
import ujd.spicegirls.RestAPIStudies.models.Type;
import ujd.spicegirls.RestAPIStudies.models.User;

import java.util.List;
import java.util.stream.Collectors;

public class TypeDtoMapper {
    private TypeDtoMapper() {
        //Prohibit the creation af the class object
    }

    public static List<TypeDto> mapToTypeDtos(List<Type> types) {
        return types.stream()
                .map(TypeDtoMapper::mapToTypeDto)
                .collect(Collectors.toList());
    }

    public static TypeDto mapToTypeDto(Type type) {
        return TypeDto.builder()
                .id(type.getId())
                .name(type.getName())
                .weight(type.getWeight())
                .build();
    }
}
