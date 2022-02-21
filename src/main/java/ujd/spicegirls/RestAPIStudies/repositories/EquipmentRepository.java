package ujd.spicegirls.RestAPIStudies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ujd.spicegirls.RestAPIStudies.models.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
