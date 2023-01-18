/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.service.impl;

import com.project.rpa.entity.Rol;
import com.project.rpa.repository.RolesRepository;
import com.project.rpa.service.IRolesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class RolesServiceImpl implements IRolesService{
    
    @Autowired
    private RolesRepository rolesRepository;

    /* @Override
    public List<Roles> findAll() {
        return rolesRepository.findAll();
    }


   @Override
    public void deleteById(Long id) {
        rolesRepository.deleteById(id);
    }
   */

    @Override
    public List<Rol> findAll() {
        return rolesRepository.findAll();
    }

    @Override
    public Optional<Rol> findById(Long id) {
        return rolesRepository.findById(id);
    }
}
