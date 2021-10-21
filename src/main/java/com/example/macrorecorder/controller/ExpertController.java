package com.example.macrorecorder.controller;

import com.example.macrorecorder.model.Roles;
import com.example.macrorecorder.model.UserModel;
import com.example.macrorecorder.service.UserService;
import com.example.macrorecorder.service.macrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/expert")
public class ExpertController {
    @Autowired
    private macrosService macroRepository;
    @Autowired
    private UserService userRepo;

    @GetMapping("/putAdvice/{accName}")
    public UserModel updateAdvice(@PathVariable String accName, @RequestBody UserModel advice) {
        return userRepo.updateAdvice(accName, advice);
    }

//    @GetMapping("/getUserByRoles")
//    public Optional<Roles> getUserByRoles(@RequestBody String role) {
//        return userRepo.getUserByRole(role);
//    }

}
