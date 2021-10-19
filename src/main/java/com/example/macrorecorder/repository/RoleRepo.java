package com.example.macrorecorder.repository;

import com.example.macrorecorder.model.ERoles;
import com.example.macrorecorder.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Roles, Long> {
    Optional<Roles> findByName(ERoles name);
}
