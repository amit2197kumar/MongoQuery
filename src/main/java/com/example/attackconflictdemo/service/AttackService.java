package com.example.attackconflictdemo.service;

import com.example.attackconflictdemo.entity.AttackEntity;

import java.util.List;

public interface AttackService {
    public List<AttackEntity> getAllAttackEntities();

    public AttackEntity createAttackEntity(AttackEntity entity);

    public Boolean createAttackConflict(AttackEntity entity);
}
