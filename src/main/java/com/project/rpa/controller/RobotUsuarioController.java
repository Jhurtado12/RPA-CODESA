/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.RobotUsuario;
import com.project.rpa.service.IRobotUsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("/robot-usuario")
public class RobotUsuarioController {
    
    @Autowired
    private IRobotUsuarioService robotUsuarioService;
    
    @GetMapping
    private ResponseEntity<List<RobotUsuario>> getAllRobotUser(){
        return ResponseEntity.ok(robotUsuarioService.findAll());
    }
    
    @RequestMapping("/robot-usuario/{id}")
    @GetMapping
    private Optional<RobotUsuario> getRobotUser(@PathVariable Long id){
        return robotUsuarioService.findById(id);
    }
}
