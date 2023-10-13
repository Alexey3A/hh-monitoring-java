package com.example.hhmonitoringjava.service;

import com.example.hhmonitoringjava.entity.Vacancy;
import com.example.hhmonitoringjava.repository.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacancyRepositoryService {
    @Autowired
    VacancyRepository vacancyRepository;

    public Vacancy saveVacancy(Vacancy vacancy){
        return vacancyRepository.save(vacancy);
    }

    public List<Vacancy> showAllVacancy(){
        return vacancyRepository.findAll();
    }

    public Vacancy showVacancy(String id){
        Vacancy vacancy = null;
        Optional<Vacancy> optional = vacancyRepository.findById(id);
        if (optional.isPresent()) {
            vacancy = optional.get();
        }
        return vacancy;
    }

    public void deleteVacancy(Vacancy vacancy) {
        vacancyRepository.delete(vacancy);
    }
}
