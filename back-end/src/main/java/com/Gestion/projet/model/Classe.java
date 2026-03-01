package com.Gestion.projet.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String niveau;


    @OneToMany(mappedBy = "classe")
    private List<Eleves> eleves;

    public String getNiveau() { return niveau;}

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
