package com.Gestion.projet.controller;

import com.Gestion.projet.model.Eleves;
import com.Gestion.projet.repository.ElevesRepository;
import com.Gestion.projet.service.ElevesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eleves")
@CrossOrigin("*")
public class ElevesController {

    @Autowired
    private ElevesRepository elevesRepository;

    @Autowired
    private ElevesServices elevesServices;

    @GetMapping
    public List<Eleves> getAll(){
        return  elevesRepository.findAll();
    }

    @PostMapping
    public Eleves create(@RequestBody Eleves eleves){
        return elevesRepository.save(eleves);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        elevesRepository.deleteById(id);
    }

    @PostMapping("/classe/{classeId}")
    public Eleves ajouterEleveAvecClasse(
            @PathVariable Long classeId,
            @RequestBody Eleves eleve) {

        return elevesServices.ajouterEleveAvecClasse(classeId, eleve);
    }
}
