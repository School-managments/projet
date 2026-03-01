package com.Gestion.projet.service;

import com.Gestion.projet.model.Classe;
import com.Gestion.projet.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    public List<Classe> getAll(){
        return classeRepository.findAll();
    }

    public Classe save(Classe classe){
        return classeRepository.save(classe);
    }

    public void delete(Long id) {
        Classe classe = classeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Classe introuvable"));
        classeRepository.delete(classe);
    }
}
