package com.sgric.backend.repositoire;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgric.backend.model.ContactPageContent;

public interface ContactPageContentRepository extends JpaRepository<ContactPageContent, Long> {
}
