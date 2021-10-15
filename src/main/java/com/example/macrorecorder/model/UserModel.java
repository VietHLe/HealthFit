package com.example.macrorecorder.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generated value to ID
    private Long user_id;
    private String user_fName;
    private String user_lName;

    @OneToOne
    @JoinColumn
    private MacroModel macro;
}
