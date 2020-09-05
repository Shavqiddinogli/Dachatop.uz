package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class BankAcc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String account;
    @Column
    private String mfo;
    @Column
    private String stir;
    @Column
    private String bank;
    @Column
    private String bank_branche;
}
