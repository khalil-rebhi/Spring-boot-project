package tn.esprit.firstproject.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etudiant")
    private int idEtudiant;
    @Column(name = "prenom_etudiant")
    private String prenomE;
    @Column(name = "nom_etudiant")
    private String nomE;
    @Column(name = "opt")
    @Enumerated(EnumType.STRING)
    private Option opt;

    public Etudiant(int idEtudiant, String prenomE, String nomE, Option option) {
        this.idEtudiant = idEtudiant;
        this.prenomE = prenomE;
        this.nomE = nomE;
        this.opt = option;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", prenomE='" + prenomE + '\'' +
                ", nomE='" + nomE + '\'' +
                ", option=" + opt +
                '}';
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Option getOption() {
        return opt;
    }

    public void setOption(Option option) {
        this.opt = option;
    }

    public Etudiant() {
    }
}
