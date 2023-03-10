package tn.esprit.firstproject.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Abonnement")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Abonnement implements Serializable {
    @Id
    @Column(name = "numAbdo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbdo;
    @Column(name = "datedebut")
    private LocalDate dateDebut;
    @Column(name="date_fin")
    private LocalDate dateFin;
    @Column(name = "prixAbon")
    private float prixAbonnement;
    @Column(name = "typeAbonnement")
    private TypeAbonnement typeAbon;

    @OneToOne(mappedBy = "abonnement")
    private Skieur skieur;

}
