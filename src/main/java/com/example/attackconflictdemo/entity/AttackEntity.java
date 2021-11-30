package com.example.attackconflictdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "attack")
public class AttackEntity {
    @Id
    private String id;

    private String name;
    private List<String> clients;
    private List<String> endpoints;

    private List<AttackSchedule> attackSchedules;

}
