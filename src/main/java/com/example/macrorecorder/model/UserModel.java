package com.example.macrorecorder.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generated value to ID
    @Column(name = "USER_ID")
    private Long userId;
    private String userFName;
    private String userLName;
    private String password;
//    @Column(name = "USER_ROLES")
//    private String roles;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "USER_ROLES", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Roles> setRoles;
}
