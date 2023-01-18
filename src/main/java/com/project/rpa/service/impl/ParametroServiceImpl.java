/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.service.impl;

import com.project.rpa.entity.Parametro;
import com.project.rpa.repository.ParametroRepository;
import com.project.rpa.service.IParametroService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class ParametroServiceImpl implements IParametroService{
    
    @Autowired
    private ParametroRepository parametroRepository;

    @Override
    public List<Parametro> findAll() {
        return parametroRepository.findAll();
    }

    @Override
    public Optional<Parametro> findById(Long id) {
        return parametroRepository.findById(id);
    }
    
    
}
