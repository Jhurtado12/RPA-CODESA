/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.DetalleParametro;
import com.project.rpa.service.IDetalleParametroService;
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
@RequestMapping("/detalles-parametros")
public class DetalleParametroController {
    
    @Autowired
    private IDetalleParametroService detalleParametroService;
    
    @GetMapping
    private ResponseEntity<List<DetalleParametro>> getAllDetalles(){
        return ResponseEntity.ok(detalleParametroService.findAll());
    }
    
    @RequestMapping("/detalles-parametros/{id}")
    @GetMapping
    private Optional<DetalleParametro> getDetalle(@PathVariable Long id){
        return detalleParametroService.findById(id);
    }
    
}
