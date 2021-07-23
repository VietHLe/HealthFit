package com.example.macrorecorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface macroInterface extends JpaRepository<macroInterface, Long> {
}
