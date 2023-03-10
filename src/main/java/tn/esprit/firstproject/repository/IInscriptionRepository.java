package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entity.Inscription;

public interface IInscriptionRepository extends JpaRepository<Inscription, Long>{
}