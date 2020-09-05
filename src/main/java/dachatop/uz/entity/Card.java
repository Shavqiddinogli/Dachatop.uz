package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String card_number;
    @Column
    private String date;
    @Column
    private String bank;
}
