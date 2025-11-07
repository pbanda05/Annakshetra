package com.annakshetra.annakshetra.controller;

import com.annakshetra.annakshetra.model.Recipient;
import com.annakshetra.annakshetra.repository.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipients")
public class RecipientController {

    @Autowired
    private RecipientRepository recipientRepository;

    @GetMapping
    public List<Recipient> getAllRecipients() {
        return recipientRepository.findAll();
    }

    @PostMapping
    public Recipient addRecipient(@RequestBody Recipient recipient) {
        return recipientRepository.save(recipient);
    }
}
