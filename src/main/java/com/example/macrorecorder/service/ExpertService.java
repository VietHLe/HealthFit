package com.example.macrorecorder.service;

import com.example.macrorecorder.repository.ExpertRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpertService {
    @Autowired
    ExpertRepo expertRepo;
}
