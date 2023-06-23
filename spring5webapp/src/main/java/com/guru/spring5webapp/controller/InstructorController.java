package com.guru.spring5webapp.controller;

import com.guru.spring5webapp.domain.Instructor;
import com.guru.spring5webapp.domain.InstructorDetail;
import com.guru.spring5webapp.dto.InstructorDto;
import com.guru.spring5webapp.repositories.InstructorDetailsRepository;
import com.guru.spring5webapp.repositories.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InstructorController {

    @Autowired
    private InstructorRepository instructorRepository;

    @Autowired
    private InstructorDetailsRepository instructorDetailsRepository;

    @PostMapping("/instructors")
    public ResponseEntity<Instructor> save(@RequestBody InstructorDto instructorDto) {
        Instructor instructor = new Instructor();
        instructor.setFirstName(instructorDto.getFirstName());
        instructor.setLastName(instructorDto.getLastName());
        instructor.setEmail(instructorDto.getEmail());

        InstructorDetail instructorDetail = new InstructorDetail();
        instructorDetail.setYoutubeChannel(instructorDto.getInstructorDetailsDto().getYoutubeChannel());
        instructorDetail.setHobby(instructorDto.getInstructorDetailsDto().getHobby());

        instructor.setInstructorDetail(instructorDetail);
        instructorDetail.setInstructor(instructor);

       return  ResponseEntity.ok(instructorRepository.save(instructor));
    }
}
