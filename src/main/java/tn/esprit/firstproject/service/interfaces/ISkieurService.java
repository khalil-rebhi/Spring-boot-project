package tn.esprit.firstproject.service.interfaces;

import tn.esprit.firstproject.entity.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> getAllSkieurs();
    Skieur getOneSkieur(Long idSkieur);
    Skieur addSkieur(Skieur skieur);
    Skieur editSkieur(Skieur skieur);
    void deleteSkieur(Long idSkieur);
}
