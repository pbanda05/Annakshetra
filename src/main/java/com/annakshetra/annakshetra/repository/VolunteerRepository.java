package com.annakshetra.annakshetra.repository;

import com.annakshetra.annakshetra.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
