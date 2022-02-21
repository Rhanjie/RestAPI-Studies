package ujd.spicegirls.RestAPIStudies.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ujd.spicegirls.RestAPIStudies.models.Equipment;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.services.EquipmentService;
import ujd.spicegirls.RestAPIStudies.services.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EquipmentController {
    private final EquipmentService equipmentService;

    @GetMapping("/equipments")
    public List<Equipment> getEquipments() {
        return equipmentService.getEquipments();
    }

    @GetMapping("/equipments/{id}")
    public Equipment getSingleEquipment(@PathVariable long id) {
        return equipmentService.getSingleEquipment(id);
    }
}

