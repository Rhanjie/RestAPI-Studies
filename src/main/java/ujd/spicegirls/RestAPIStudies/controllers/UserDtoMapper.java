package ujd.spicegirls.RestAPIStudies.controllers;

import ujd.spicegirls.RestAPIStudies.controllers.dtos.UserDto;
import ujd.spicegirls.RestAPIStudies.models.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDtoMapper {
    private UserDtoMapper() {
        //Prohibit the creation af the class object
    }

    public static List<UserDto> mapToUserDtos(List<User> users) {
        return users.stream()
                .map(UserDtoMapper::mapToUserDto)
                .collect(Collectors.toList());
    }

    public static UserDto mapToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .pesel(user.getPesel())
                .age(user.getAge())
                .build();
    }
}
