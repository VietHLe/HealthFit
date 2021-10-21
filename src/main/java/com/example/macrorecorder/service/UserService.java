package com.example.macrorecorder.service;

import com.example.macrorecorder.model.ERoles;
import com.example.macrorecorder.model.MacroModel;
import com.example.macrorecorder.model.Roles;
import com.example.macrorecorder.model.UserModel;
import com.example.macrorecorder.repository.RoleRepo;
import com.example.macrorecorder.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    public List<UserModel> getUser(){ return userRepo.findAll();}

//    public Optional<Roles> getUserByRole(ERoles role){ return roleRepo.findByRoles(role);}

    public UserModel userCreate(UserModel userModel){

        return userRepo.save(userModel);
    }
    public UserModel updateRole(Long id, UserModel role){
        UserModel myRole = userRepo.findById(id).orElse(null);
        Set<Roles> newRole = role.getSetRoles();
        myRole.setSetRoles(newRole);
        return userRepo.save(myRole);
    }
    public UserModel updateAdvice(String accName, UserModel role){
        UserModel advice = userRepo.findByAccName(accName).orElse(null);
        String newAdvice = advice.getAdvice();
        advice.setAdvice(newAdvice);
        return userRepo.save(advice);
    }

}
