package com.Gestion.projet.repository;

import com.Gestion.projet.model.Eleves;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
ElevesRepository  extends JpaRepository <Eleves,Long> {
}
