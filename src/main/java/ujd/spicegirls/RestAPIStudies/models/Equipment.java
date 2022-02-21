package ujd.spicegirls.RestAPIStudies.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Equipment {
    @Id
    private long id;
    private String model;
    private String producer;
    private int maximumLoad;
    private float weight;
    private String range;
    private String batteryCapacity;
}
