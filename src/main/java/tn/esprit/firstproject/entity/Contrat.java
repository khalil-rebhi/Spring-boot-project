package tn.esprit.firstproject.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Contrat")
    private int idContrat;
    @Temporal(TemporalType.DATE)
    @Column(name="date_debut_contrat")
    private Date dateDebutContrat;

    @Temporal(TemporalType.DATE)
    @Column(name="date_fin_contrat")
    private Date dateFinContrat;
    @Column(name="archive")
    private boolean archive;
    @Enumerated(EnumType.STRING)
    @Column(name="specialite")
    private Specialite specialite;
    @Column(name="montant_contrat")
    private int montantcontrat;

    public Contrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Contrat(int idContrat, Date dateDebutContrat, Date dateFinContrat, boolean archive, Specialite specialite, int montantcontrat) {
        this.idContrat = idContrat;
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
        this.archive = archive;
        this.specialite = specialite;
        this.montantcontrat = montantcontrat;
    }

    public Contrat() {
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public int getMontantcontrat() {
        return montantcontrat;
    }

    public void setMontantcontrat(int montantcontrat) {
        this.montantcontrat = montantcontrat;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "idContrat=" + idContrat +
                ", dateDebutContrat=" + dateDebutContrat +
                ", dateFinContrat=" + dateFinContrat +
                ", archive=" + archive +
                ", specialite=" + specialite +
                ", montantcontrat=" + montantcontrat +
                '}';
    }
}
