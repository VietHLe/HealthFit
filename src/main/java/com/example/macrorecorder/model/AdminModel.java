package com.example.macrorecorder.model;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class AdminModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generated value to ID
    private Long admin_id;
    private String admin_fName;
    private String admin_lName;
    private String password;

}
