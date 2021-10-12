package com.example.macrorecorder.controller;

import com.example.macrorecorder.model.AdminModel;
import com.example.macrorecorder.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminRepo;

    @GetMapping("admin")
    public List<AdminModel> adminGetAll() {
        return adminRepo.adminGetAll();
    }
    @PostMapping("admin")
    public AdminModel create(@RequestBody AdminModel admin){
        return adminRepo.adminCreate(admin);
    }
}
