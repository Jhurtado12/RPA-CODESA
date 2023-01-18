/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.service.impl;

import com.project.rpa.entity.Robot;
import com.project.rpa.repository.RobotRepository;
import com.project.rpa.service.IRobotService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class RobotServiceImpl implements IRobotService{
    
    @Autowired
    private RobotRepository robotRepository;

    @Override
    public List<Robot> findAll() {
        return robotRepository.findAll();
    }

    @Override
    public Optional<Robot> findById(Long id) {
        return robotRepository.findById(id);
    }
}
