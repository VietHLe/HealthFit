package com.example.macrorecorder.service;

import com.example.macrorecorder.model.AdminModel;
import com.example.macrorecorder.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;

    public List<AdminModel> adminGetAll() {

        return adminRepo.findAll();
    }
    public AdminModel adminCreate(AdminModel adminModel){

        return adminRepo.save(adminModel);
    }


}
