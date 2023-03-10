package tn.esprit.firstproject.service.classes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Inscription;
import tn.esprit.firstproject.repository.IInscriptionRepository;
import tn.esprit.firstproject.service.interfaces.IInscriptionService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class InscriptionServiceImpl implements IInscriptionService {

    private final IInscriptionRepository inscriptionRepository;

    @Override
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription getOneInscription(Long id) {
        return inscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription editInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void deleteInscription(Long id) {
        inscriptionRepository.deleteById(id);
    }
}
