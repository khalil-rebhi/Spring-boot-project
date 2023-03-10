package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entity.Skieur;
import tn.esprit.firstproject.service.interfaces.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/skieur")
@Tag(name = "skieur managment")
public class SkieurRestController {
    @Autowired
    private ISkieurService skieurService;

    @GetMapping("/show")
    @Operation(description = "get all skieurs")
    ResponseEntity<List<Skieur>> getAllSkieurs(){
        List<Skieur> skieurs = skieurService.getAllSkieurs();
        if (skieurs != null){
            return ResponseEntity.ok(skieurs);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/show/{id}")
    @Operation(description = "get one skieurs")
    ResponseEntity<Skieur> getOneSkieur(@PathVariable("id") Long id){
        Skieur skieur = skieurService.getOneSkieur(id);
        if (skieur != null){
            return ResponseEntity.ok(skieur);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    @Operation(description = "add skieur")
    ResponseEntity<Skieur> addSkieur(@RequestBody Skieur skieur){
        Skieur newSkieur = skieurService.addSkieur(skieur);
        if (newSkieur != null){
            return ResponseEntity.ok(newSkieur);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/edit/{id}")
    @Operation(description = "edit skieur")
    ResponseEntity<Skieur> editSkieur(@RequestBody Skieur skieur,@PathVariable("id") Long id){
        skieur.setNumSkieur(id);
        Skieur updatedSkieur = skieurService.editSkieur(skieur);
        if (updatedSkieur != null){
            return ResponseEntity.ok(updatedSkieur);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    @Operation(description = "delete skieur")
    void deleteSkieur(@PathVariable("id") Long id){
        skieurService.deleteSkieur(id);
    }
}
