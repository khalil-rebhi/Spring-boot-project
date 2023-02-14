package tn.esprit.firstproject.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Depart")
    private int idDepart;
    @Column(name="nom_Depart")
    private String nomDepart;

    public Departement(int idDepart, String nomDepart) {
        this.idDepart = idDepart;
        this.nomDepart = nomDepart;
    }

    public Departement() {
    }

    public int getIdDepart() {
        return idDepart;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "idDepart=" + idDepart +
                ", nomDepart='" + nomDepart + '\'' +
                '}';
    }

    public void setIdDepart(int idDepart) {
        this.idDepart = idDepart;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }
}
