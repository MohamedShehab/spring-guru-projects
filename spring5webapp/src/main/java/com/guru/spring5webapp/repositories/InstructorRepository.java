package com.guru.spring5webapp.repositories;

import com.guru.spring5webapp.domain.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor , Integer> {
}
