package com.annakshetra.annakshetra.repository;

import com.annakshetra.annakshetra.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
