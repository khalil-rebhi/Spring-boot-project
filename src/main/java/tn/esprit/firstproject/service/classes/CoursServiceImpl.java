package tn.esprit.firstproject.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Cours;
import tn.esprit.firstproject.repository.ICoursRepository;
import tn.esprit.firstproject.service.interfaces.ICoursService;

import java.util.List;
@Service
public class CoursServiceImpl implements ICoursService {
    @Autowired
    private ICoursRepository coursRepository;
    @Override
    public List<Cours> getAllCourss() {
        return coursRepository.findAll();
    }

    @Override
    public Cours getOneCours(Long id) {
        return coursRepository.findById(id).orElse(null);
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours editCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void deleteCours(Long id) {
        coursRepository.deleteById(id);
    }
}
