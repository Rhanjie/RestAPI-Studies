package ujd.spicegirls.RestAPIStudies.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import ujd.spicegirls.RestAPIStudies.controllers.dtos.TypeDto;
import ujd.spicegirls.RestAPIStudies.models.Book;
import ujd.spicegirls.RestAPIStudies.models.Type;
import ujd.spicegirls.RestAPIStudies.services.TypeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TypeController {
    private final TypeService typeService;

    @GetMapping("/types")
    public List<TypeDto> getEquipmentTypes(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = (page != null) ? Math.abs(page) : 0;
        Sort.Direction sortDirection = (sort != null) ? sort : Sort.Direction.ASC;

        return TypeDtoMapper.mapToTypeDtos(typeService.getEquipmentTypes(pageNumber, sortDirection));
    }

    @GetMapping("/types/equipments")
    public List<Type> getTypesWithEquipments(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = (page != null) ? Math.abs(page) : 0;
        Sort.Direction sortDirection = (sort != null) ? sort : Sort.Direction.ASC;

        return typeService.getTypesWithEquipments(pageNumber, sortDirection);
    }

    @GetMapping("/types/{id}")
    public Type getSingleEquipmentType(@PathVariable long id) {
        return typeService.getSingleEquipmentType(id);
    }

    @PostMapping("/types")
    public Type createEquipmentType(@RequestBody Type type) {
        return typeService.createEquipmentType(type);
    }

    @PostMapping("/types/equipments")
    public Book createEquipment(@RequestBody Book book) {
        return typeService.createEquipment(book);
    }

    @PutMapping("/types")
    public Type updateEquipmentType(@RequestBody Type type) {
        return typeService.updateEquipmentType(type);
    }

    @PutMapping("/types/equipments")
    public Book updateEquipment(@RequestBody Book book) {
        return typeService.updateEquipment(book);
    }

    @DeleteMapping("/types/{id}")
    public void deleteEquipmentType(@PathVariable long id) {
        typeService.deleteEquipmentType(id);
    }

    @DeleteMapping("/types/equipments/{id}")
    public void deleteEquipment(@PathVariable long id) {
        typeService.deleteEquipment(id);
    }
}

