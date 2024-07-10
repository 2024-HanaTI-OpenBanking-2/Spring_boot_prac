package openbanking.team2.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cert")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Long age;
}