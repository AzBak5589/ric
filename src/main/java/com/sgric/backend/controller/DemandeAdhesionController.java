package com.sgric.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgric.backend.model.DemandeAdhesion;
import com.sgric.backend.model.ReponseModel;
import com.sgric.backend.services.DemandeAdhesionService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/demandeadhesion")
public class DemandeAdhesionController {
    @Autowired
    private DemandeAdhesionService demAdhesionService;

    @PostMapping("/save")
    private ReponseModel save(@RequestBody DemandeAdhesion body) {
        DemandeAdhesion res = null;
        try {
            res = demAdhesionService.save(body);
        } catch (Exception e) {
            return new ReponseModel(false, null, e.getMessage());
        }
        return new ReponseModel(true, res, null);
    }

    @GetMapping("/listdemande")
    private ReponseModel getAll() {
        List<DemandeAdhesion> data = new ArrayList<>();
        try {
            data = demAdhesionService.getAll();
        } catch (Exception e) {
            return new ReponseModel(false, data, e.getMessage());
        }
        return new ReponseModel(true, data, null);
    }
}
