package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class Price {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Column
        private Double simple_price;
        @Column
        private Double special_price;
        @Column
        private Double gage_percentage;

}
