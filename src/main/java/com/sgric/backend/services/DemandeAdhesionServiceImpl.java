package com.sgric.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgric.backend.model.DemandeAdhesion;
import com.sgric.backend.repositoire.DemandeAdhesionDao;

@Service
public class DemandeAdhesionServiceImpl implements DemandeAdhesionService {

    @Autowired
    private DemandeAdhesionDao demDao;

    @Override
    public DemandeAdhesion save(DemandeAdhesion dem) {
        DemandeAdhesion res = null;
        try {
            res = demDao.save(dem);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<DemandeAdhesion> getAll() {
        List<DemandeAdhesion> res = new ArrayList<>();
        try {
            res = demDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
