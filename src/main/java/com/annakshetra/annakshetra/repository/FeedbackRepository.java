package com.annakshetra.annakshetra.repository;

import com.annakshetra.annakshetra.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
