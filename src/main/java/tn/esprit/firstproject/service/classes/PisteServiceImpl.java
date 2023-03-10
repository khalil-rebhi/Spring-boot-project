package tn.esprit.firstproject.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Piste;
import tn.esprit.firstproject.repository.IPisteRepository;
import tn.esprit.firstproject.service.interfaces.IPisteService;

import java.util.List;


@Service
public class PisteServiceImpl implements IPisteService {
    @Autowired
    private IPisteRepository pisteRepository;

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste getOnePiste(Long idPiste) {
        return pisteRepository.findById(idPiste).orElse(null);
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void removePist(Long id) {
        pisteRepository.deleteById(id);
    }
}
