package com.sgric.backend.services;

import java.util.List;

import com.sgric.backend.model.DemandeAdhesion;

public interface DemandeAdhesionService {
    DemandeAdhesion save(DemandeAdhesion dem);

    List<DemandeAdhesion> getAll();
}
