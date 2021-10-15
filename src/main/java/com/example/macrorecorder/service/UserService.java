package com.example.macrorecorder.service;

import com.example.macrorecorder.model.ERoles;
import com.example.macrorecorder.model.MacroModel;
import com.example.macrorecorder.model.Roles;
import com.example.macrorecorder.model.UserModel;
import com.example.macrorecorder.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserModel userCreate(UserModel userModel){

        return userRepo.save(userModel);
    }
    public UserModel updateRole(Long id, UserModel role){
        UserModel myRole = userRepo.findById(id).orElse(null);
        Set<Roles> newRole = role.getSetRoles();
        myRole.setSetRoles(newRole);
        return userRepo.save(myRole);
    }
}
