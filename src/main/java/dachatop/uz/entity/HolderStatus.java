package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class HolderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String landlord;
    @Column
    private String broker;

}
