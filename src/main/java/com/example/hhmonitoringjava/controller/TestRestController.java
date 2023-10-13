package com.example.hhmonitoringjava.controller;

import com.example.hhmonitoringjava.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.hhmonitoringjava.service.TestRepositoryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestRestController {
    @Autowired
    TestRepositoryService testRepositoryService;

    @GetMapping("/tests")
    public List<Test> showTest(){
        return testRepositoryService.findAllTest();
    }

    @PostMapping("/tests")
    public Test saveTest(@RequestBody Test test){
        return testRepositoryService.saveTest(test);
    }
}
