package com.sgric.backend.repositoire;

import com.sgric.backend.model.Accueil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccueilRepository extends JpaRepository<Accueil, Long> {
}

