package com.annakshetra.annakshetra.controller;

import com.annakshetra.annakshetra.model.Donation;
import com.annakshetra.annakshetra.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:5173"})
public class DonationController {

    @Autowired
    private DonationRepository donationRepository;

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    @PostMapping
    public Donation addDonation(@RequestBody Donation donation) {
        return donationRepository.save(donation);
    }
}
