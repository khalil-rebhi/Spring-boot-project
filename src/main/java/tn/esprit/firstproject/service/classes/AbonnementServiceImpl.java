package tn.esprit.firstproject.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Abonnement;
import tn.esprit.firstproject.repository.IAbonnementRepository;
import tn.esprit.firstproject.service.interfaces.IAbonnementService;

import java.util.List;
@Service
public class AbonnementServiceImpl implements IAbonnementService {

    @Autowired
    private IAbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> getAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement getOneAbonnement(Long id) {
        return abonnementRepository.findById(id).orElse(null);
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement editAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public void deleteAbonnement(Long id) {
        abonnementRepository.deleteById(id);
    }
}
