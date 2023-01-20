/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.rpa.entity.compuest.RobotUsuarioPK;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
@Table(name = "robotusuario")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RobotUsuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRobotUsuario")
    private Long id;

    /*@EmbeddedId
    private RobotUsuarioPK id;*/

    private Character estado;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "usuario_idUsuario")
    private Usuario usuario;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "robot_idRobot", insertable = false, updatable = false)
    private Robot robot;

}
