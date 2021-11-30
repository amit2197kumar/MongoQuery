package com.example.attackconflictdemo.repository;

import com.example.attackconflictdemo.entity.AttackEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AttackRepository extends MongoRepository<AttackEntity, String> {
}
