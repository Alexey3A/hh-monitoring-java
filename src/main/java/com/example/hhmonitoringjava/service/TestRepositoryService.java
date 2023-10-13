package com.example.hhmonitoringjava.service;

import com.example.hhmonitoringjava.entity.Test;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hhmonitoringjava.repository.TestRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TestRepositoryService {

    @Autowired
    TestRepository testRepository;

    public List<Test> findAllTest(){
        return testRepository.findAll();
    }

    public Test saveTest(Test test) {
        return testRepository.save(test);
    }

    @PostConstruct
    public void savePostContract(){
        testRepository.save(new Test("Hello"));
        testRepository.save(new Test("How are you?"));
        testRepository.save(new Test("I want to tell you an interesting history"));
    }
}
