package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entity.Skieur;

public interface ISkieurRepository extends JpaRepository<Skieur, Long> {
}