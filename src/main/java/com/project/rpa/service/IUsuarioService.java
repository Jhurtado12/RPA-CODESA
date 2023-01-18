/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.rpa.service;

import com.project.rpa.entity.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author usuario
 */
public interface IUsuarioService {

    List<Usuario> findAll();

    <S extends Usuario> S save(S entity);

    Optional<Usuario> findById(Long id);
    
    void deleteById(Long id);

}
