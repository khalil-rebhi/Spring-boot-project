package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entity.Piste;
import tn.esprit.firstproject.service.interfaces.IPisteService;

import java.util.List;
@Tag(name = "Piste management")
@RestController
@RequestMapping("/piste")
public class PisteRestController {
    @Autowired
    private IPisteService pisteService;

    @Operation(description="retrieve all pistes")
    @GetMapping("/show")
    ResponseEntity<List<Piste>> getAllPistes(){
        List<Piste> pistes = pisteService.getAllPistes();
        if (pistes != null){
            return ResponseEntity.ok(pistes);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @Operation(description = "retrieve one piste by id")
    @GetMapping("/show/{id}")
    ResponseEntity<Piste> getOnePiste(@PathVariable("id") Long id){
        Piste piste = pisteService.getOnePiste(id);
        if (piste != null){
            return ResponseEntity.ok(piste);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(description = "add new piste")
    @PostMapping("/new")
    ResponseEntity<Piste> addPiste(@RequestBody Piste piste){
        System.out.println("here");
        Piste newPiste = pisteService.addPiste(piste);
        if (newPiste != null){
            return ResponseEntity.ok(newPiste);
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(description = "edit existing piste")
    @PutMapping("/edit/{id}")
    ResponseEntity<Piste> editPiste(@PathVariable("id") Long idPiste , @RequestBody Piste piste){
        piste.setNumPiste(idPiste);
        Piste updatedPiste = pisteService.updatePiste(piste);
        if (updatedPiste != null){
            return ResponseEntity.ok(updatedPiste);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(description = "delete piste")
    @DeleteMapping("delete/{id}")
    void deletePiste(@PathVariable("id") Long idPiste){
        pisteService.removePist(idPiste);
    }

}
