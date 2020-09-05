package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class VillasAdress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String region;
    @Column
    private String disc;
    @Column
    private String street;
    @Column
    private String house;
    @Column
    private String quartal;

}
