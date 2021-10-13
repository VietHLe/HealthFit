package com.example.macrorecorder.controller;


import com.example.macrorecorder.model.ExpertModel;
import com.example.macrorecorder.model.MacroModel;
import com.example.macrorecorder.service.ExpertService;
import com.example.macrorecorder.service.macrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expert")
public class ExpertController {
    @Autowired
    private ExpertService expertRepo;
    @Autowired
    private macrosService macroRepository;

    @GetMapping("expert")
    public List<ExpertModel> getAllMacros() {
        return expertRepo.expertGetAll();
    }
    @PutMapping("expert/advice/{id}")
    public MacroModel adviceUpdate(@PathVariable Long id, @RequestBody MacroModel advice){
        return macroRepository.advice(id,advice);
    }


}
