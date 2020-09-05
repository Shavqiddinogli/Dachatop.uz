package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class PaymentInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Card card_id;
    @Column
    private BankAcc bankacc_id;
}
