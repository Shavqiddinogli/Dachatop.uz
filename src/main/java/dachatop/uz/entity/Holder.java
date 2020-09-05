package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class Holder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private HolderStatus holderStatus_id;
}
