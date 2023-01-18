/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Entity
@Table(name = "logs")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Log {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLog")
    private Long id;

    private String valor;

    private String estado;
    
    private LocalDateTime fechaCreacion;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "robot_idRobot", insertable = false, updatable = false)
    private Robot robot;
        
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "evento_idEvento", insertable = false, updatable = false)
    private Evento evento;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "usuario_idUsuario", insertable = false, updatable = false)
    private Usuario usuario;
    
}
