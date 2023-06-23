package com.guru.spring5webapp.repositories;

import com.guru.spring5webapp.domain.Tutorial;
import org.springframework.data.repository.CrudRepository;

public interface TutorialRepository extends CrudRepository<Tutorial , Long> {
}
