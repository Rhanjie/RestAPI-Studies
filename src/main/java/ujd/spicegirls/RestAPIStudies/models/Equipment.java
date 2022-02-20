package ujd.spicegirls.RestAPIStudies.models;

import javax.persistence.Id;

public class Equipment {
    @Id
    private long id;
    private String model;
    private String producer;
    private int maximumLoad;
    private float weight;
    private String range;
    private String battery_capacity;
}
