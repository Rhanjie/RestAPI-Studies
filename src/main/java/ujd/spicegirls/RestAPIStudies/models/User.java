package ujd.spicegirls.RestAPIStudies.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private long pesel;

    @OneToMany
    @JoinColumn(name = "idUser", updatable = false, insertable = false)
    private List<Payment> payments;
}
