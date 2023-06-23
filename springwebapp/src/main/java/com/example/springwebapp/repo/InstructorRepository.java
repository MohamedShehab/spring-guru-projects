package com.example.springwebapp.repo;

import com.example.springwebapp.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor , Long> {
}
