package com.example.macrorecorder.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class ExpertModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generated value to ID
    private Long expert_id;
    private String expert_fName;
    private String expert_lName;

    @ManyToOne
    private AdminModel admin;

    @OneToMany(mappedBy = "expert")
    private List<MacroModel> users;
}
