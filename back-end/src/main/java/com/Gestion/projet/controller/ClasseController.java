package com.Gestion.projet.controller;

import com.Gestion.projet.model.Classe;
import com.Gestion.projet.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
@CrossOrigin("*")

public class ClasseController {
    @Autowired
    private ClasseService classeService;

    @GetMapping
    public List<Classe> getAll(){
        return classeService.getAll();
    }

    @PostMapping
    public Classe create(@RequestBody Classe classe){
        return classeService.save(classe);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        classeService.delete(id);
    }
}
