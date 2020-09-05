package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class Dacha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer count_room;
    @Column
    private Integer bed1;
    @Column
    private Integer bed2;
    @Column
    private Double overall_square;
    @Column
    private Double living_square;
    @Column
    private Price price_id;
    @Column
    private Time time_id;
    @Column
    private VideoLink videolink_id;
    @Column
    private Rules rules_id;
    @Column
    private Conveniences conveniences_id;
    @Column
    private PaymentInformation paymentInformation_id;
    @Column
    private Holder holder_id;
    @Column
    private HoldersContact holdersContact_id;
    @Column
    private VillasAdress villasAdress_id;



}
