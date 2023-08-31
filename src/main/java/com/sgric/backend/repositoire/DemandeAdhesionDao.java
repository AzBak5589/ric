package com.sgric.backend.repositoire;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgric.backend.model.DemandeAdhesion;

public interface DemandeAdhesionDao extends JpaRepository<DemandeAdhesion, Long> {

}
