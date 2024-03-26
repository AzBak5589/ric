package com.sgric.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgric.backend.model.ContactPageContent;
import com.sgric.backend.repositoire.ContactPageContentRepository;

@Service
public class ContactPageContentService {

    @Autowired
    private ContactPageContentRepository repository;

    public ContactPageContent save(ContactPageContent content) {
        return repository.save(content);
    }

    public ContactPageContent getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    // Additional methods as needed

}
