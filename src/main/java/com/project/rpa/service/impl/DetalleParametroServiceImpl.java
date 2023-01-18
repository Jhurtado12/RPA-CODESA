/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.service.impl;

import com.project.rpa.entity.DetalleParametro;
import com.project.rpa.repository.DetalleParametroRepository;
import com.project.rpa.service.IDetalleParametroService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class DetalleParametroServiceImpl implements IDetalleParametroService{
    
    @Autowired
    private DetalleParametroRepository detalleParametroRepository;

    @Override
    public List<DetalleParametro> findAll() {
        return detalleParametroRepository.findAll();
    }

    @Override
    public Optional<DetalleParametro> findById(Long id) {
        return detalleParametroRepository.findById(id);
    }
    
    
}
