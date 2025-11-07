package com.annakshetra.annakshetra.controller;

import com.annakshetra.annakshetra.model.Volunteer;
import com.annakshetra.annakshetra.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @Autowired
    private VolunteerRepository volunteerRepository;

    @GetMapping
    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    @PostMapping
    public Volunteer addVolunteer(@RequestBody Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }
}
