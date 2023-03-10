package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entity.Moniteur;

public interface IMoniteurRepository extends JpaRepository<Moniteur, Long> {
}