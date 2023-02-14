package tn.esprit.firstproject.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_detailEquipe")
    private int idDetailEquipe;
    @Column(name="salle")
    private int salle;
    @Column(name="thematique")
    private String thematique;

    public DetailEquipe() {
    }

    public DetailEquipe(int idDetailEquipe, int salle, String thematique) {
        this.idDetailEquipe = idDetailEquipe;
        this.salle = salle;
        this.thematique = thematique;
    }

    public int getIdDetailEquipe() {
        return idDetailEquipe;
    }

    public void setIdDetailEquipe(int idDetailEquipe) {
        this.idDetailEquipe = idDetailEquipe;
    }

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }

    @Override
    public String toString() {
        return "DetailEquipe{" +
                "idDetailEquipe=" + idDetailEquipe +
                ", salle=" + salle +
                ", thematique='" + thematique + '\'' +
                '}';
    }
}
