/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.service.impl;

import com.project.rpa.entity.Log;
import com.project.rpa.repository.LogRepository;
import com.project.rpa.service.ILogService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class LogServiceImpl implements ILogService{
    
    @Autowired
    private LogRepository logRepository;

    @Override
    public List<Log> findAll() {
        return  logRepository.findAll();
    }

    @Override
    public Optional<Log> findById(Long id) {
        return logRepository.findById(id);
    }
    
    
}
