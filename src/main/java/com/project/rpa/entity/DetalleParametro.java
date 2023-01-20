/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.rpa.entity.compuest.DetalleParametroPK;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "detalleparametro")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DetalleParametro {

   //@EmbeddedId
   //private DetalleParametroPK id;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetalleParametro")
    private Long id;

    private String valor;

    private String estado;

    private String observaciones;
    
    @JsonBackReference
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "parametro_idParametro")
    private Parametro parametro;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "robot_idRobot")
    private Robot robot;
}
