package ujd.spicegirls.RestAPIStudies.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Type {
    @Id
    private long id;
    private String name;
    private float weight;

    @OneToMany
    @JoinColumn(name = "id_type")
    private List<Equipment> equipments;
}
