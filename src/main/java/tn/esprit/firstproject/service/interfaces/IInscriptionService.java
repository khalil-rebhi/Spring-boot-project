package tn.esprit.firstproject.service.interfaces;

import tn.esprit.firstproject.entity.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> getAllInscriptions();
    Inscription getOneInscription(Long id);
    Inscription addInscription(Inscription inscription);
    Inscription editInscription(Inscription inscription);
    void deleteInscription(Long id);
}
