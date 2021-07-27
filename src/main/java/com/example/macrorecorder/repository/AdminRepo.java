package com.example.macrorecorder.repository;

import com.example.macrorecorder.model.AdminModel;
import com.example.macrorecorder.model.MacroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Long>{
}
