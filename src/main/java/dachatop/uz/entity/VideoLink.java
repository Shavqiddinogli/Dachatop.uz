package dachatop.uz.entity;

import javax.persistence.*;

@Entity
public class VideoLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String url_path;
}
