package com.guru.spring5webapp.repositories;

import com.guru.spring5webapp.domain.InstructorDetail;
import org.springframework.data.repository.CrudRepository;

public interface InstructorDetailsRepository extends CrudRepository<InstructorDetail, Integer> {
}
