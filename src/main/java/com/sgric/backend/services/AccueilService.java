package com.sgric.backend.services;

import com.sgric.backend.model.Accueil;
import com.sgric.backend.repositoire.AccueilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AccueilService {

    @Autowired
    private AccueilRepository accueilRepository;

    public List<Accueil> getAllAccueils() {
        return accueilRepository.findAll();
    }

    public Optional<Accueil> getAccueilById(Long id) {
        return accueilRepository.findById(id);
    }

    public Accueil createAccueil(Accueil accueil) {
        return accueilRepository.save(accueil);
    }

    public Accueil updateAccueil(Long id, Accueil accueilDetails) {
        Accueil accueil = accueilRepository.findById(id).orElseThrow(() -> new RuntimeException("Accueil not found"));
        accueil.setTitle(accueilDetails.getTitle());
        accueil.setName(accueilDetails.getName());
        accueil.setParagraph(accueilDetails.getParagraph());
        return accueilRepository.save(accueil);
    }

    public void deleteAccueil(Long id) {
        Accueil accueil = accueilRepository.findById(id).orElseThrow(() -> new RuntimeException("Accueil not found"));
        accueilRepository.delete(accueil);
    }
}

