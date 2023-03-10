package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entity.Moniteur;
import tn.esprit.firstproject.service.interfaces.IMoniteurService;

import java.util.List;
@RestController
@RequestMapping("/moniteur")
@Tag(name = "moniteur managment")
public class MoniteurRestController {
    @Autowired
    private IMoniteurService moniteurService;

    @GetMapping("/show")
    @Operation(description = "get all moniteur")
    ResponseEntity<List<Moniteur>> getAllMoniteur() {
        List<Moniteur> moniteurs = moniteurService.getAllMoniteurs();
        if (moniteurs != null) {
            return ResponseEntity.ok(moniteurs);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/show/{id}")
    @Operation(description = "show one moniteur")
    ResponseEntity<Moniteur> getOneMoniteur(@PathVariable("id") Long id) {
        Moniteur moniteur = moniteurService.getOneMoniteur(id);
        if (moniteur != null) {
            return ResponseEntity.ok(moniteur);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/new")
    @Operation(description = "add new moniteur")
    ResponseEntity<Moniteur> addMoniteur(@RequestBody Moniteur moniteur) {
        Moniteur newMoniteur = moniteurService.addMoniteur(moniteur);
        if (newMoniteur != null) {
            return ResponseEntity.ok(newMoniteur);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/edit/{id}")
    @Operation(description = "edit moniteur")
    ResponseEntity<Moniteur> editMoniteur(@PathVariable("id") Long id, @RequestBody Moniteur moniteur) {
        moniteur.setNumMoniteur(id);
        Moniteur updatedAbon = moniteurService.updateMoniteur(moniteur);
        if (updatedAbon != null) {
            return ResponseEntity.ok(updatedAbon);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    @Operation(description = "delete moniteur")
    void deleteMoniteur(@PathVariable("id") Long id) {
        moniteurService.removeMoniteur(id);
    }

}