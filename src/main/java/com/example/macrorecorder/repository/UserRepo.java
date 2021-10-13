package com.example.macrorecorder.repository;

import com.example.macrorecorder.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<UserModel, Long> {
}
