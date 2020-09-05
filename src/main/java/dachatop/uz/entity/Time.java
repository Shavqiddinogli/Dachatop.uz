package dachatop.uz.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Date coming;
    @Column
    private Date left;
}
