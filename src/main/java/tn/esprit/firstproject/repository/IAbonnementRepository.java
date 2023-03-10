package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entity.Abonnement;

public interface IAbonnementRepository extends JpaRepository<Abonnement, Long> {
}