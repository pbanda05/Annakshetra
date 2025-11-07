package com.annakshetra.annakshetra.repository;

import com.annakshetra.annakshetra.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}
