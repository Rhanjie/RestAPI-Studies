package ujd.spicegirls.RestAPIStudies.services;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ujd.spicegirls.RestAPIStudies.models.Book;
import ujd.spicegirls.RestAPIStudies.models.Genre;
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

    @Cacheable(cacheNames = "EquipmentTypes")
    public List<Genre> getEquipmentTypes(int page, Sort.Direction sort) {
        return typeRepository.findAllTypes(PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
    }

    @Cacheable(cacheNames = "TypesWithEquipments")
    public List<Genre> getTypesWithEquipments(int page, Sort.Direction sort) {
        var types = typeRepository.findAllTypes(PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
        var ids = types.stream()
                .map(Genre::getId)
                .collect(Collectors.toList());

        var equipments = equipmentRepository.findAllByIdTypeIn(ids);
        types.forEach(user -> user.setEquipments(extractEquipment(equipments, user.getId())));

        return types;
    }

    @Cacheable(cacheNames = "SingleEquipmentType")
    public Genre getSingleEquipmentType(long id) {
        return typeRepository.findById(id)
                .orElseThrow();
    }

    private List<Book> extractEquipment(List<Book> books, long id) {
        return books.stream()
                .filter(book -> book.getIdType() == id)
                .collect(Collectors.toList());
    }

    public Genre createEquipmentType(Genre genre) {
        return typeRepository.save(genre);
    }

    public Book createEquipment(Book book) {
        return equipmentRepository.save(book);
    }

    @Transactional
    public Genre updateEquipmentType(Genre genre) {
        Genre updatingGenre = typeRepository.findById(genre.getId()).orElseThrow();

        updatingGenre.setName(genre.getName());
        updatingGenre.setWeight(genre.getWeight());

        return updatingGenre;
    }

    @Transactional
    public Book updateEquipment(Book book) {
        Book updatingBook = equipmentRepository.findById(book.getId()).orElseThrow();

        updatingBook.setIdType(book.getIdType());
        updatingBook.setModel(book.getModel());
        updatingBook.setProducer(book.getProducer());
        updatingBook.setMaximumLoad(book.getMaximumLoad());
        updatingBook.setWeight(book.getWeight());
        updatingBook.setRange(book.getRange());
        updatingBook.setBatteryCapacity(book.getBatteryCapacity());

        return updatingBook;
    }

    public void deleteEquipmentType(long id) {
        typeRepository.deleteById(id);
    }

    public void deleteEquipment(long id) {
        equipmentRepository.deleteById(id);
    }
}

