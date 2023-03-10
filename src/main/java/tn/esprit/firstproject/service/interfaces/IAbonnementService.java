package tn.esprit.firstproject.service.interfaces;

import tn.esprit.firstproject.entity.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> getAllAbonnements();
    Abonnement getOneAbonnement(Long id);
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement editAbonnement(Abonnement abonnement);
    void deleteAbonnement(Long id);
}
