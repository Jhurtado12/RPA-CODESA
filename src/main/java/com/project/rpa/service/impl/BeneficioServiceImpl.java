/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.service.impl;

import com.project.rpa.entity.Beneficio;
import com.project.rpa.repository.BeneficioRepository;
import com.project.rpa.service.IBeneficioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class BeneficioServiceImpl implements IBeneficioService{

    @Autowired
    private BeneficioRepository beneficioRepository;

    @Override
    public List<Beneficio> findAll() {
        return beneficioRepository.findAll();
    }

    @Override
    public Optional<Beneficio> findById(Long id) {
        return beneficioRepository.findById(id);
    }
    
    
}

