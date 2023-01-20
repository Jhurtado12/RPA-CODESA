/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.Rol;
import com.project.rpa.service.IRolesService;
import com.project.rpa.service.impl.RolesServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("/roles")
public class RolesController {
    
    @Autowired
    private IRolesService rolesService;
    
    @GetMapping
    private ResponseEntity<List<Rol>> getAllRoles(){
        return ResponseEntity.ok(rolesService.findAll());
    }
}
