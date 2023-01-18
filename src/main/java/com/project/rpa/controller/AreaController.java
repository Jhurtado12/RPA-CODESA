/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.Area;
import com.project.rpa.service.IAreaService;
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
@RequestMapping("/areas")
public class AreaController {
    
    @Autowired
    private IAreaService areaService;
    
    @GetMapping
    private ResponseEntity<List<Area>> findAll(){
        return ResponseEntity.ok(areaService.findAll());
    }
    
    @RequestMapping("/{id}")
    @GetMapping
    private Optional<Area> getArea(@PathVariable Long id){
        return areaService.findById(id);
    }
}