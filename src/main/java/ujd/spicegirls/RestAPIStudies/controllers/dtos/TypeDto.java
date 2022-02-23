package ujd.spicegirls.RestAPIStudies.controllers.dtos;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TypeDto {
    private long id;
    private String name;
    private float weight;
}
