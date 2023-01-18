/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.Beneficio;
import com.project.rpa.service.IBeneficioService;
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
@RequestMapping("/beneficios/")
public class BeneficioController {
    
    @Autowired
    private IBeneficioService beneficioService;
    
    @GetMapping
    private ResponseEntity<List<Beneficio>> getAllBeneficios(){
        return ResponseEntity.ok(beneficioService.findAll());
    }
    
    @RequestMapping("/beneficio/{id}")
    @GetMapping
    private Optional<Beneficio> getBeneficio(@PathVariable Long id){
        return beneficioService.findById(id);
    }
}
