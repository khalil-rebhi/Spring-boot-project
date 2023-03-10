package tn.esprit.firstproject.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_piste")
    private Long numPiste;
    @Column(name = "nom_piste")
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    @Column(name = "longueur")
    private int longueur;
    @Column(name = "pente")
    private int pente;

    @ManyToMany(mappedBy = "pistes")
    private Set<Skieur> skieurs;
}
