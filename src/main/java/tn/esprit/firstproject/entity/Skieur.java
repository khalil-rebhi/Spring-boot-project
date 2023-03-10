package tn.esprit.firstproject.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Skieur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    @Column(name = "nom_skieur")
    private String nomS;
    @Column(name = "prenom_skieur")
    private String prenomS;
    @Column(name = "date_naissance")
    private LocalDate dateNaissance;
    @Column(name = "ville")
    private String ville;
    @OneToOne
    private Abonnement abonnement;
    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptions;
    @ManyToMany
    private Set<Piste> pistes;
}

