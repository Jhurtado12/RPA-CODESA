/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.Log;
import com.project.rpa.service.ILogService;
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
@RequestMapping("/logs")
public class LogController {
    
    @Autowired
    private ILogService logService;
    
    @GetMapping
    private ResponseEntity<List<Log>> getAllLogs(){
        return ResponseEntity.ok(logService.findAll());
    }
    
    @RequestMapping("/logs/{id}")
    @GetMapping
    private Optional<Log> getLog(@PathVariable Long id){
        return logService.findById(id);
    }
}
