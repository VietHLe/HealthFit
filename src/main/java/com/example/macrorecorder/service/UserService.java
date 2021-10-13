package com.example.macrorecorder.service;

import com.example.macrorecorder.model.UserModel;
import com.example.macrorecorder.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<UserModel> expertGetAll() {

        return userRepo.findAll();
    }
    public UserModel userCreate(UserModel userModel){

        return userRepo.save(userModel);
    }
}
