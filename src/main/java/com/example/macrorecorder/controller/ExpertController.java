package com.example.macrorecorder.controller;


import com.example.macrorecorder.model.ExpertModel;
import com.example.macrorecorder.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expert")
public class ExpertController {
    @Autowired
    private ExpertService expertRepo;

    @GetMapping("expert")
    public List<ExpertModel> getAllMacros() {
        return expertRepo.expertGetAll();
    }
    @PostMapping("expert")
    public ExpertModel create(@RequestBody ExpertModel expert){
        return expertRepo.expertCreate(expert);
    }
}
