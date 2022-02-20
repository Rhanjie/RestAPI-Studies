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
public class User {
    @Id
    private long id;
    private String name;
    private String surname;
    private long pesel;

    @OneToMany
    @JoinColumn(name = "id_user")
    private List<Payment> payments;
}
