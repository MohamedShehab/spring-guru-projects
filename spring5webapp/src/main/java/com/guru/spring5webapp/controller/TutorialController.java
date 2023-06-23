package com.guru.spring5webapp.controller;

import com.guru.spring5webapp.domain.Tutorial;
import com.guru.spring5webapp.exception.ResourceNotFoundException;
import com.guru.spring5webapp.repositories.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TutorialController {

    @Autowired
    TutorialRepository tutorialRepository;

    @GetMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) throws ResourceNotFoundException {
        Tutorial tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

        return new ResponseEntity<>(tutorial, HttpStatus.OK);
    }

    @PostMapping("/tutorials")
    public ResponseEntity<Tutorial> save(@RequestBody Tutorial tutorial) throws ResourceNotFoundException {
        return new ResponseEntity<>(tutorialRepository.save(tutorial), HttpStatus.OK);
    }
}
