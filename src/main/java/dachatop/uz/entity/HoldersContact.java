package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class HoldersContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String phone1;
    @Column
    private String phone2;
    @Column
    private String email;
    @Column
    private String telegram;

}
