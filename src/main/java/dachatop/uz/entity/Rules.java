package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class Rules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Boolean smoking;
    @Column
    private Boolean alcohol;
    @Column
    private Boolean animals;
    @Column
    private Boolean only_family;
    @Column
    private Boolean loud_music;
    @Column
    private Boolean party;



}
