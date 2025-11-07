package com.annakshetra.annakshetra.repository;

import com.annakshetra.annakshetra.model.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository<Recipient, Long> {
}
