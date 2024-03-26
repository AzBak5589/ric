package com.sgric.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgric.backend.model.HomePageContent;
import com.sgric.backend.repositoire.HomePageContentRepository;

@Service
public class HomePageContentService {

    @Autowired
    private HomePageContentRepository repository;

    public HomePageContent save(HomePageContent content) {
        return repository.save(content);
    }

    public HomePageContent getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    // Additional methods as needed

}
