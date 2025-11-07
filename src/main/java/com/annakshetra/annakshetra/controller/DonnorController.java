package com.annakshetra.annakshetra.controller;

import com.annakshetra.annakshetra.model.Donor;
import com.annakshetra.annakshetra.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
public class DonnorController {

    @Autowired
    private DonorRepository donorRepository;

    @GetMapping
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @PostMapping
    public Donor createDonor(@RequestBody Donor donor) {
        return donorRepository.save(donor);
    }

    @GetMapping("/{id}")
    public Donor getDonorById(@PathVariable Long id) {
        return donorRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteDonor(@PathVariable Long id) {
        donorRepository.deleteById(id);
    }
}
