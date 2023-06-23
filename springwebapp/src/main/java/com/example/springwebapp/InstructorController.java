package com.example.springwebapp;

import com.example.springwebapp.models.Instructor;
import com.example.springwebapp.repo.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class InstructorController {

    @Autowired
    private InstructorRepository instructorRepository;

    @PostMapping("/instructors")
    public ResponseEntity<Instructor> save(@RequestBody Instructor instructor) {
        return new ResponseEntity<>(instructorRepository.save(instructor), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Optional<Instructor> instructorOptional = instructorRepository.findById(id);
        Instructor instructor = null;
        if (instructorOptional.isPresent()) {
            instructor = instructorOptional.get();
            instructorRepository.delete(instructor);
        }
    }
}
