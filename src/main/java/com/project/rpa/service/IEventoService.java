/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.rpa.service;

import com.project.rpa.entity.Evento;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author usuario
 */
public interface IEventoService {
    List<Evento> findAll();
    Optional<Evento> findById(Long id);
    
}
