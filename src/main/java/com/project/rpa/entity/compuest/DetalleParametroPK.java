/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.entity.compuest;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.rpa.entity.Parametro;
import com.project.rpa.entity.Robot;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author usuario
 */
@Embeddable
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DetalleParametroPK implements Serializable{
    
    @Column(name = "idDetalleParametro")
    private Long id;
    
 
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "robot_idRobot", insertable = false, updatable = false)
    private Robot robot;

    
    
    @JsonBackReference    
    @ManyToOne  
    @JoinColumn(name = "parametro_idParametro", insertable = false, updatable = false)
    private Parametro parametro;
}
