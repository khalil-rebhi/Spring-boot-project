package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entity.Piste;

public interface IPisteRepository extends JpaRepository<Piste,Long> {

    //la liste des inscriptions des skieurs avec abonnement mensuelles
}
