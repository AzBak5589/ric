package com.sgric.backend.repositoire;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgric.backend.model.HomePageContent;

public interface HomePageContentRepository extends JpaRepository<HomePageContent, Long> {
}
