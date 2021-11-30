package com.example.attackconflictdemo.entity;

import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class AttackSchedule {
    private  String id;
    private LocalDate startDate;
    private  LocalDate endDate;
    private LocalTime startTime;
    private  LocalTime endTime;
    private  RecurrenceType recurrenceType;
    private List<DayOfWeek> days = new ArrayList<>();
}
