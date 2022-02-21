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

    private static final int PAGE_SIZE = 5;

    public List<Type> getEquipmentTypes(int page) {
        return typeRepository.findAllTypes(PageRequest.of(page, PAGE_SIZE));
    }

    public Type getSingleEquipmentType(long id) {
        return typeRepository.findById(id)
                .orElseThrow();
    }
}

