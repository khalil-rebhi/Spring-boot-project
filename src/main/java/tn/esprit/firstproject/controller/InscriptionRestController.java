package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entity.Inscription;
import tn.esprit.firstproject.service.interfaces.IInscriptionService;

import java.util.List;

@RestController
@Tag(name = "Inscription Management")
@RequestMapping("/inscription")
public class InscriptionRestController {
    @Autowired
    private IInscriptionService inscriptionService;

    @Operation(description = "get all inscriptions")
    @GetMapping("/show")
    ResponseEntity<List<Inscription>> getAllInscriptions(){
        List<Inscription> inscriptions = inscriptionService.getAllInscriptions();
        if (inscriptions != null){
            return ResponseEntity.ok(inscriptions);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(description = "get One inscription by id")
    @GetMapping("/show/{id}")
    ResponseEntity<Inscription> getOneInscription(@PathVariable("id") Long id){
        Inscription inscription = inscriptionService.getOneInscription(id);
        if(inscription != null){
            return ResponseEntity.ok(inscription);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(description = "add new inscription")
    @PostMapping("/new")
    ResponseEntity<Inscription> addInscription(@RequestBody Inscription inscription){
        Inscription newInscription = inscriptionService.addInscription(inscription);
        if (newInscription != null){
            return ResponseEntity.ok(newInscription);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(description = "edit an inscription")
    @PutMapping("/edit/{id}")
    ResponseEntity<Inscription> editInscription(@PathVariable("id") Long id, @RequestBody Inscription inscription){
        inscription.setNumInscription(id);
        Inscription updatedInscription = inscriptionService.editInscription(inscription);
        if (updatedInscription != null){
            return ResponseEntity.ok(updatedInscription);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(description = "delete an inscription")
    @DeleteMapping("/delete/{id}")
    void DeleteInscription(@PathVariable("id") Long id){
        inscriptionService.deleteInscription(id);
    }
}
