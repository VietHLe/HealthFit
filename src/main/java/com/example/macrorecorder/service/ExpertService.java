package com.example.macrorecorder.service;

import com.example.macrorecorder.model.AdminModel;
import com.example.macrorecorder.model.ExpertModel;
import com.example.macrorecorder.repository.ExpertRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertService {
    @Autowired
    private ExpertRepo expertRepo;

    public List<ExpertModel> expertGetAll() {

        return expertRepo.findAll();
    }
    public ExpertModel expertCreate(ExpertModel expertModel){

        return expertRepo.save(expertModel);
    }
}
