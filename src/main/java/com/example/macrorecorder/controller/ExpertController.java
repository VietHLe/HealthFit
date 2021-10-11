package com.example.macrorecorder.controller;

import com.example.macrorecorder.service.ExpertService;
import com.example.macrorecorder.service.macrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expert")
public class ExpertController {
    @Autowired
    private ExpertService expertRepo;
}
