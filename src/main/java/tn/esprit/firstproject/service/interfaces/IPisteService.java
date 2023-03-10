package tn.esprit.firstproject.service.interfaces;

import tn.esprit.firstproject.entity.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> getAllPistes();
    Piste getOnePiste(Long idPiste);
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    void removePist(Long id);


}
