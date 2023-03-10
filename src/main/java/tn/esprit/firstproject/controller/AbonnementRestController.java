package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entity.Abonnement;
import tn.esprit.firstproject.service.interfaces.IAbonnementService;

import java.util.List;

@RestController
@RequestMapping("/abonnement")
@Tag(name = "abonnement managment")
public class AbonnementRestController {

    @Autowired
    private IAbonnementService abonnementService;

    @GetMapping("/show")
    @Operation(description = "get all abonnement")
    ResponseEntity<List<Abonnement>> getAllAbonnement(){
        List<Abonnement> abonnements = abonnementService.getAllAbonnements();
        if (abonnements != null){
            return ResponseEntity.ok(abonnements);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/show/{id}")
    @Operation(description = "show one abonnement")
    ResponseEntity<Abonnement> getOneAbonnement(@PathVariable("id") Long id){
        Abonnement abonnement = abonnementService.getOneAbonnement(id);
        if (abonnement != null){
            return ResponseEntity.ok(abonnement);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/new")
    @Operation(description = "add new abonnement")
    ResponseEntity<Abonnement> addAbonnement(@RequestBody Abonnement abonnement){
        Abonnement newAbonnement = abonnementService.addAbonnement(abonnement);
        if (newAbonnement != null){
            return ResponseEntity.ok(newAbonnement);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/edit/{id}")
    @Operation(description = "edit abonnement")
    ResponseEntity<Abonnement> editAbonnement(@PathVariable("id") Long id, @RequestBody Abonnement abonnement){
        abonnement.setNumAbdo(id);
        Abonnement updatedAbon = abonnementService.editAbonnement(abonnement);
        if (updatedAbon != null){
            return ResponseEntity.ok(updatedAbon);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    @Operation(description = "delete abonnement")
    void deleteAbonnement(@PathVariable("id") Long id){
        abonnementService.deleteAbonnement(id);
    }
}
