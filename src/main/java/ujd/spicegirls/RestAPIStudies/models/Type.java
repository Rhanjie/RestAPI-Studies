package ujd.spicegirls.RestAPIStudies.models;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

public class Type {
    @Id
    private long id;
    private String name;
    private float weight;

    @OneToMany
    @JoinColumn(name = "id_type")
    private List<Payment> payments;
}
