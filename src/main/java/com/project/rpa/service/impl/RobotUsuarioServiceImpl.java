/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.service.impl;

import com.project.rpa.entity.RobotUsuario;
import com.project.rpa.repository.RobotUsuarioRepository;
import com.project.rpa.service.IRobotUsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class RobotUsuarioServiceImpl implements IRobotUsuarioService{
    
    @Autowired
    private RobotUsuarioRepository robotUsuarioRepository;

    @Override
    public List<RobotUsuario> findAll() {
        return robotUsuarioRepository.findAll();
    }

    @Override
    public Optional<RobotUsuario> findById(Long id) {
        return robotUsuarioRepository.findById(id);
    }
    
}
