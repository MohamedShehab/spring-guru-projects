package com.guru.spring5webapp.dto;

public class InstructorDto {
    private String firstName;
    private String lastName;
    private String email;

    private InstructorDetailsDto instructorDetailsDto;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InstructorDetailsDto getInstructorDetailsDto() {
        return instructorDetailsDto;
    }

    public void setInstructorDetailsDto(InstructorDetailsDto instructorDetailsDto) {
        this.instructorDetailsDto = instructorDetailsDto;
    }
}
