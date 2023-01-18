/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.Parametro;
import com.project.rpa.service.IParametroService;
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
@RequestMapping("/parametros")
public class ParametroController {
    
    @Autowired
    private IParametroService parametroService;
    
    @GetMapping
    private ResponseEntity<List<Parametro>> getAllParametros(){
        return ResponseEntity.ok(parametroService.findAll());
    }
    
    @RequestMapping("parametro/{id}")
    @GetMapping
    private Optional<Parametro> getParametro(@PathVariable Long id){
        return parametroService.findById(id);
    }
}
