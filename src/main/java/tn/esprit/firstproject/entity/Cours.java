package tn.esprit.firstproject.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "cours")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numCours")
    private Long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support suppport;
    private float prix;
    private int crenau;

    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptions;
}
