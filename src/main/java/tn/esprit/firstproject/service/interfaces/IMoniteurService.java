package tn.esprit.firstproject.service.interfaces;

import tn.esprit.firstproject.entity.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> getAllMoniteurs();
    Moniteur getOneMoniteur(Long idMoniteur);
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    void removeMoniteur(Long id);
}
