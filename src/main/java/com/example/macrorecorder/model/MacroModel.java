package com.example.macrorecorder.model;

import lombok.Data;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data // annotation that combines the features like @ToString,@EqualsAndHashCode,@Getter,@Setter,@RequiredArgsConstructor generate a constructor with no parameters
public class MacroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generated value to ID
    private Long id;
    private String advice;

    private int calories;

    @Temporal(TemporalType.DATE)
    private Date date = new Date(System.currentTimeMillis());

    private String dueDate = "Empty";
    private boolean finish = false;



    private String foodEat = "Food";
    private int caloriesFood = 0;
    private int carbs = 0;
    private int protein = 0;
    private int fat = 0;

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName= "USER_ID")
    private UserModel userModel;

    public MacroModel() {

    }
}
