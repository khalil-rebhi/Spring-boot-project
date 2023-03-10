package tn.esprit.firstproject.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Skieur;
import tn.esprit.firstproject.repository.ISkieurRepository;
import tn.esprit.firstproject.service.interfaces.ISkieurService;

import java.util.List;

@Service
public class SkieurServiceImpl implements ISkieurService {
    @Autowired
    private ISkieurRepository skieurRepository;

    @Override
    public List<Skieur> getAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur getOneSkieur(Long idSkieur) {
        return skieurRepository.findById(idSkieur).orElse(null);
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur editSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void deleteSkieur(Long idSkieur) {
        skieurRepository.deleteById(idSkieur);
    }
}
