/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.Empresa;
import com.project.rpa.service.IEmpresaService;
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
@RequestMapping("/empresa")
public class EmpresaController {
    
    @Autowired
    private IEmpresaService empresaService;
    
    @GetMapping
    private ResponseEntity<List<Empresa>> getAllEmpresas(){
        return ResponseEntity.ok(empresaService.findAll());
    }
    
    @GetMapping(path = "/{id}")
    private Optional<Empresa> getEmpresa(@PathVariable Long id){
        return empresaService.findByID(id);
    }
}
