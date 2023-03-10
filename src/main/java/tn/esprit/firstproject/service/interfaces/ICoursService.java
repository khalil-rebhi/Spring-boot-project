package tn.esprit.firstproject.service.interfaces;

import tn.esprit.firstproject.entity.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> getAllCourss();
    Cours getOneCours(Long id);
    Cours addCours(Cours cours);
    Cours editCours(Cours cours);
    void deleteCours(Long id);
}
