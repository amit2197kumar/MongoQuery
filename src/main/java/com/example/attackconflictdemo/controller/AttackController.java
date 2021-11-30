package com.example.attackconflictdemo.controller;

import com.example.attackconflictdemo.entity.AttackEntity;
import com.example.attackconflictdemo.service.AttackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attack")
public class AttackController {

    @Autowired
    AttackService attackService;

    @GetMapping("/getAll")
    public List<AttackEntity> getAllAttackEntities() {
        return attackService.getAllAttackEntities();
    }

    @PostMapping("/")
    public AttackEntity createAttackEntity(@RequestBody AttackEntity entity) {
        return attackService.createAttackEntity(entity);
    }

    @PostMapping("/conflict")
    public Boolean checkConflict(@RequestBody AttackEntity entity) {
        return attackService.createAttackConflict(entity);
    }
}
