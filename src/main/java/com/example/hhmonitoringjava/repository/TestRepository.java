package com.example.hhmonitoringjava.repository;

import com.example.hhmonitoringjava.entity.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface TestRepository extends MongoRepository<Test, Long> {
}
