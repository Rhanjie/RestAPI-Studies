package ujd.spicegirls.RestAPIStudies.controllers.dtos;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GenreDto {
    private long id;
    private String name;
    private Boolean onlyForAdults;
}
