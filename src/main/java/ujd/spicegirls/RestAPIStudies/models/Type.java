package ujd.spicegirls.RestAPIStudies.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private float weight;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "idType", updatable = false, insertable = false)
    private List<Equipment> equipments;
}
