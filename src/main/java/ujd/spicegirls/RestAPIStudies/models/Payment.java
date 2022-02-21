package ujd.spicegirls.RestAPIStudies.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    private long id;
    private long idUser;
    private String name;
    private LocalDateTime borrowDate;
    private LocalDateTime expirationDate;
}
