package com.example.macrorecorder.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ExpertModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generated value to ID
    private Long expert_id;
    private String expert_advice;
    private String expert_fName;
    private String expert_lName;
}
