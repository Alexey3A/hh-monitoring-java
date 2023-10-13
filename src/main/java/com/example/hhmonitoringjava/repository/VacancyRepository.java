package com.example.hhmonitoringjava.repository;

import com.example.hhmonitoringjava.entity.Vacancy;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VacancyRepository extends MongoRepository<Vacancy, String> {
}
