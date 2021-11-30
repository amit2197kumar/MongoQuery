package com.example.attackconflictdemo.service.impl;

import com.example.attackconflictdemo.entity.AttackEntity;
import com.example.attackconflictdemo.repository.AttackRepository;
import com.example.attackconflictdemo.service.AttackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttackServiceImpl implements AttackService {

    @Autowired
    AttackRepository attackRepository;

    @Override
    public List<AttackEntity> getAllAttackEntities() {
        return attackRepository.findAll();
    }

    @Override
    public AttackEntity createAttackEntity(AttackEntity entity) {
        return attackRepository.save(entity);
    }

    @Override
    public Boolean createAttackConflict(AttackEntity entity) {
        return null;
    }
}
