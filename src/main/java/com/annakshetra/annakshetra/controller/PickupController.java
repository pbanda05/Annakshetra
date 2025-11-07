package com.annakshetra.annakshetra.controller;

import com.annakshetra.annakshetra.model.Pickup;
import com.annakshetra.annakshetra.repository.PickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pickups")
public class PickupController {

    @Autowired
    private PickupRepository pickupRepository;

    @GetMapping
    public List<Pickup> getAllPickups() {
        return pickupRepository.findAll();
    }

    @PostMapping
    public Pickup addPickup(@RequestBody Pickup pickup) {
        return pickupRepository.save(pickup);
    }
}
