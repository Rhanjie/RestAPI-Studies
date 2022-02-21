package ujd.spicegirls.RestAPIStudies.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ujd.spicegirls.RestAPIStudies.controllers.dtos.TypeDto;
import ujd.spicegirls.RestAPIStudies.models.Type;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.services.TypeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TypeController {
    private final TypeService typeService;

    @GetMapping("/types")
    public List<TypeDto> getEquipmentTypes(@RequestParam(required = false) int page, Sort.Direction sort) {
        return TypeDtoMapper.mapToTypeDtos(typeService.getEquipmentTypes(Math.abs(page), sort));
    }

    @GetMapping("/types/equipments")
    public List<Type> getTypesWithEquipments(@RequestParam(required = false) int page, Sort.Direction sort) {
        return typeService.getTypesWithEquipments(Math.abs(page), sort);
    }

    @GetMapping("/types/{id}")
    public Type getSingleEquipmentType(@PathVariable long id) {
        return typeService.getSingleEquipmentType(id);
    }
}

