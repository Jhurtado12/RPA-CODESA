/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.Robot;
import com.project.rpa.service.IRobotService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/robots")
public class RobotController {
    
    @Autowired
    private IRobotService robotService;
    
    @GetMapping
    private ResponseEntity<List<Robot>> findAll(){
        return ResponseEntity.ok(robotService.findAll());
    }
    
    @RequestMapping("/{id}")
    @GetMapping
    private Optional<Robot> getRobot(@PathVariable Long id){
        return robotService.findById(id);
    }
}
