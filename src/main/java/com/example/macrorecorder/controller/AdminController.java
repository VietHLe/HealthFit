package com.example.macrorecorder.controller;

import com.example.macrorecorder.model.UserModel;
import com.example.macrorecorder.service.UserService;
import com.example.macrorecorder.service.macrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private macrosService macroRepository;
    @Autowired
    private UserService userRepo;

    @GetMapping("/getAdmin")
    public List<UserModel> adminGet() {
        return userRepo.getUser();
    }
}
