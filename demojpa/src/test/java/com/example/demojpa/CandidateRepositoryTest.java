package com.example.demojpa;

import com.example.demojpa.entity.Candidate;
import com.example.demojpa.entity.Guardian;
import com.example.demojpa.repository.CandidateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class CandidateRepositoryTest {
    @Autowired
    private CandidateRepository candidateRepository;
    //Test, autowire, perform operation
    @Test
    public void saveCandidate(){
        Candidate candidate= Candidate.builder().name("manish").marks(87).department("ece").guardian(Guardian.builder().name("sunny").email("Sunny@gmail.com").mobile("645321").build()).build();
        candidateRepository.save(candidate);
    }

    @Test
    public void ListAllCandidiates(){
        List<Candidate> list=candidateRepository.findAll();
        System.out.println(list);
    }
}
