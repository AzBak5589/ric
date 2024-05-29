package com.sgric.backend.controller;



import com.sgric.backend.model.Accueil;
import com.sgric.backend.services.AccueilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accueils")
public class AdminController {

    @Autowired
    private AccueilService accueilService;

    @GetMapping
    public List<Accueil> getAllAccueils() {
        return accueilService.getAllAccueils();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Accueil> getAccueilById(@PathVariable Long id) {
        Accueil accueil = accueilService.getAccueilById(id).orElseThrow(() -> new RuntimeException("Accueil not found"));
        return ResponseEntity.ok(accueil);
    }

    @PostMapping
    public Accueil createAccueil(@RequestBody Accueil accueil) {
        return accueilService.createAccueil(accueil);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Accueil> updateAccueil(@PathVariable Long id, @RequestBody Accueil accueilDetails) {
        Accueil updatedAccueil = accueilService.updateAccueil(id, accueilDetails);
        return ResponseEntity.ok(updatedAccueil);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccueil(@PathVariable Long id) {
        accueilService.deleteAccueil(id);
        return ResponseEntity.noContent().build();
    }
}

