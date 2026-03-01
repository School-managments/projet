package com.Gestion.projet.service;

import com.Gestion.projet.model.Classe;
import com.Gestion.projet.model.Eleves;
import com.Gestion.projet.repository.ClasseRepository;
import com.Gestion.projet.repository.ElevesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElevesServices {

    @Autowired
    private ElevesRepository elevesRepository;

    public void deleteById(Long id) {
        elevesRepository.deleteById(id);
    }

    public List<Eleves> getAll() {
        return elevesRepository.findAll();
    }

    public Eleves save(Eleves eleves) {
        return elevesRepository.save(eleves);
    }
    @Autowired
    private ClasseRepository classeRepository;

    public Eleves ajouterEleveAvecClasse(Long classeId, Eleves eleve) {

        Classe classe = classeRepository.findById(classeId)
                .orElseThrow(() -> new RuntimeException("Classe introuvable"));

        eleve.setClasse(classe);
        return elevesRepository.save(eleve);
    }
}
