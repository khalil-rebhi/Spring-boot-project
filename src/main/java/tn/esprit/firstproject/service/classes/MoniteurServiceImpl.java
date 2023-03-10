package tn.esprit.firstproject.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Moniteur;
import tn.esprit.firstproject.repository.IMoniteurRepository;
import tn.esprit.firstproject.service.interfaces.IMoniteurService;

import java.util.List;

@Service
public class MoniteurServiceImpl implements IMoniteurService {
    @Autowired
    private IMoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> getAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur getOneMoniteur(Long id) {
        return moniteurRepository.findById(id).orElse(null);
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public void removeMoniteur(Long id) {
        moniteurRepository.deleteById(id);
    }
}
