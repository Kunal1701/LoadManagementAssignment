package com.example.loadmanagement.dao;

import com.example.loadmanagement.model.Load;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoadDao extends JpaRepository<Load, Long> {

}

