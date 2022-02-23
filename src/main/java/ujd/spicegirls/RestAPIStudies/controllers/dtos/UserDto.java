package ujd.spicegirls.RestAPIStudies.controllers.dtos;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDto {
    private long id;
    private String name;
    private String surname;
    private long pesel;
}
