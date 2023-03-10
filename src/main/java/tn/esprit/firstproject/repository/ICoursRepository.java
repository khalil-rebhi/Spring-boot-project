package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entity.Cours;

public interface ICoursRepository extends JpaRepository<Cours, Long> {
}