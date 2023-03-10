package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entity.Cours;
import tn.esprit.firstproject.service.interfaces.ICoursService;

import java.util.List;

@RestController
@RequestMapping("/cours")
@Tag(name = "cours managment")
public class CoursRestController {
    @Autowired
    private ICoursService coursService;

    @GetMapping("/show")
    @Operation(description = "get all cours")
    ResponseEntity<List<Cours>> getAllCours() {
        List<Cours> courss = coursService.getAllCourss();
        if (courss != null) {
            return ResponseEntity.ok(courss);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/show/{id}")
    @Operation(description = "show one cours")
    ResponseEntity<Cours> getOneCours(@PathVariable("id") Long id) {
        Cours cours = coursService.getOneCours(id);
        if (cours != null) {
            return ResponseEntity.ok(cours);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/new")
    @Operation(description = "add new cours")
    ResponseEntity<Cours> addCours(@RequestBody Cours cours) {
        Cours newCours = coursService.addCours(cours);
        if (newCours != null) {
            return ResponseEntity.ok(newCours);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/edit/{id}")
    @Operation(description = "edit cours")
    ResponseEntity<Cours> editCours(@PathVariable("id") Long id, @RequestBody Cours cours) {
        cours.setNumCours(id);
        Cours updatedAbon = coursService.editCours(cours);
        if (updatedAbon != null) {
            return ResponseEntity.ok(updatedAbon);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    @Operation(description = "delete cours")
    void deleteCours(@PathVariable("id") Long id) {
        coursService.deleteCours(id);
    }
}
