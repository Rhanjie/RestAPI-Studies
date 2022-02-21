package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ujd.spicegirls.RestAPIStudies.models.Equipment;
import ujd.spicegirls.RestAPIStudies.models.Payment;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    List<Equipment> findAllByIdTypeIn(List<Long> ids);
}
