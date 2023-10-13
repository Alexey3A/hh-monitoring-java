package com.example.hhmonitoringjava.controller;

import com.example.hhmonitoringjava.entity.Vacancy;
import com.example.hhmonitoringjava.service.VacancyRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VacancyRestController {
    @Autowired
    VacancyRepositoryService vacancyRepositoryService;

    @GetMapping("/vacancies")
    public List<Vacancy> showAllVacancy(){
        return vacancyRepositoryService.showAllVacancy();
    }

    @GetMapping("/vacancies/{id}")
    public Vacancy showVacancy(@PathVariable String id){
        return vacancyRepositoryService.showVacancy(id);
    }

    @PostMapping("/vacancies")
    public Vacancy saveVacancy(@RequestBody Vacancy vacancy){
        return vacancyRepositoryService.saveVacancy(vacancy);
    }

    @DeleteMapping("/vacancies")
    public void deleteVacancy(@RequestBody Vacancy vacancy){
        vacancyRepositoryService.deleteVacancy(vacancy);
    }
}
