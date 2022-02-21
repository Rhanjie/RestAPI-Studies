package ujd.spicegirls.RestAPIStudies.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ujd.spicegirls.RestAPIStudies.models.Equipment;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.repositories.EquipmentRepository;
import ujd.spicegirls.RestAPIStudies.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;

    public List<Equipment> getEquipments() {
        return equipmentRepository.findAll();
    }

    public Equipment getSingleEquipment(long id) {
        return equipmentRepository.findById(id)
                .orElseThrow();
    }
}

