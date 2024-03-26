package com.sgric.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgric.backend.model.HelpUsPageContent;
import com.sgric.backend.repositoire.HelpUsPageContentRepository;

@Service
public class HelpUsPageContentService {

    @Autowired
    private HelpUsPageContentRepository repository;

    public HelpUsPageContent save(HelpUsPageContent content) {
        return repository.save(content);
    }

    public HelpUsPageContent getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    // Additional methods as needed

}
