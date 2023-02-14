package tn.esprit.firstproject.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class University implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_univ")
    private int idUniv;
    @Column(name = "nom_unive")
    private String nomUniv;

    public University() {
    }

    public University(int idUniv, String nomUniv) {
        this.idUniv = idUniv;
        this.nomUniv = nomUniv;
    }

    public int getIdUniv() {
        return idUniv;
    }


    public void setIdUniv(int idUniv) {
        this.idUniv = idUniv;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }

    @Override
    public String toString() {
        return "University{" +
                "idUniv=" + idUniv +
                ", nomUniv='" + nomUniv + '\'' +
                '}';
    }
}
