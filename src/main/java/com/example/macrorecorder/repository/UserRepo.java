package com.example.macrorecorder.repository;

import com.example.macrorecorder.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo  extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByAccName(String username);

    Boolean existsByAccName(String username);

    Boolean existsByEmail(String email);
}
