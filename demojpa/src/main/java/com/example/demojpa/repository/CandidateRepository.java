package com.example.demojpa.repository;

import com.example.demojpa.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository  extends JpaRepository<Candidate,Integer> {
}
