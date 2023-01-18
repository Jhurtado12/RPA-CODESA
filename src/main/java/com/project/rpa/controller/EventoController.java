/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.controller;

import com.project.rpa.entity.Evento;
import com.project.rpa.service.IEventoService;
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
@RequestMapping("/eventos/")
public class EventoController {
    
    @Autowired
    private IEventoService eventoService;
    
    @GetMapping
    private ResponseEntity<List<Evento>> getAllEvents(){
        return ResponseEntity.ok(eventoService.findAll());
    }
    
    @RequestMapping("/eventos/{id}")
    private Optional<Evento> getEvent(@PathVariable Long id){
        return eventoService.findById(id);
    }
}
