package ujd.spicegirls.RestAPIStudies.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ujd.spicegirls.RestAPIStudies.models.Equipment;
import ujd.spicegirls.RestAPIStudies.models.Type;
import ujd.spicegirls.RestAPIStudies.repositories.TypeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeService {
    private final TypeRepository typeRepository;

    public List<Type> getEquipmentTypes() {
        return typeRepository.findAllTypes(PageRequest.of(0, 5));
    }

    public Type getSingleEquipmentType(long id) {
        return typeRepository.findById(id)
                .orElseThrow();
    }
}

