package ujd.spicegirls.RestAPIStudies.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ujd.spicegirls.RestAPIStudies.models.Equipment;
import ujd.spicegirls.RestAPIStudies.models.Payment;
import ujd.spicegirls.RestAPIStudies.models.Type;
import ujd.spicegirls.RestAPIStudies.models.User;
import ujd.spicegirls.RestAPIStudies.repositories.EquipmentRepository;
import ujd.spicegirls.RestAPIStudies.repositories.TypeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TypeService {
    private final TypeRepository typeRepository;
    private final EquipmentRepository equipmentRepository;

    private static final int PAGE_SIZE = 5;

    public List<Type> getEquipmentTypes(int page, Sort.Direction sort) {
        return typeRepository.findAllTypes(PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
    }

    public List<Type> getTypesWithEquipments(int page, Sort.Direction sort) {
        var types = typeRepository.findAllTypes(PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
        var ids = types.stream()
                .map(Type::getId)
                .collect(Collectors.toList());

        var equipments = equipmentRepository.findAllByIdTypeIn(ids);
        types.forEach(user -> user.setEquipments(extractEquipment(equipments, user.getId())));

        return types;
    }

    public Type getSingleEquipmentType(long id) {
        return typeRepository.findById(id)
                .orElseThrow();
    }

    private List<Equipment> extractEquipment(List<Equipment> equipments, long id) {
        return equipments.stream()
                .filter(equipment -> equipment.getIdType() == id)
                .collect(Collectors.toList());
    }

    public Type createEquipmentType(Type type) {
        return typeRepository.save(type);
    }

    public Equipment createEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @Transactional
    public Type updateEquipmentType(Type type) {
        Type updatingType = typeRepository.findById(type.getId()).orElseThrow();

        updatingType.setName(type.getName());
        updatingType.setWeight(type.getWeight());

        return updatingType;
    }

    @Transactional
    public Equipment updateEquipment(Equipment equipment) {
        Equipment updatingEquipment = equipmentRepository.findById(equipment.getId()).orElseThrow();

        updatingEquipment.setIdType(equipment.getIdType());
        updatingEquipment.setModel(equipment.getModel());
        updatingEquipment.setProducer(equipment.getProducer());
        updatingEquipment.setMaximumLoad(equipment.getMaximumLoad());
        updatingEquipment.setWeight(equipment.getWeight());
        updatingEquipment.setRange(equipment.getRange());
        updatingEquipment.setBatteryCapacity(equipment.getBatteryCapacity());

        return updatingEquipment;
    }

    public void deleteEquipmentType(long id) {
        typeRepository.deleteById(id);
    }

    public void deleteEquipment(long id) {
        equipmentRepository.deleteById(id);
    }
}

