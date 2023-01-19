/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "robot")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Robot {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRobot")
    private Long id;

    private String nombre;
    
    private String descripcion;
    
    private String rutaDocumentacion;

    private Character estado;
    
    private LocalDateTime horaEjecucion;
    
    
    
    /*RELACIONES*/
    /*Relacion con parametros*/
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "robot", cascade = {CascadeType.ALL})
    private Set<DetalleParametro> detalleParametro;
    
    /*Relacion con log*/
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "robot", cascade = {CascadeType.ALL})
    private Set<Log> logs;

    /*Relacion con beneficios*/
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "robot", cascade = {CascadeType.ALL})
    private Set<Beneficio> beneficios;

    /*Relacion con usuarios*/    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "robot", cascade = {CascadeType.ALL})
    private Set<RobotUsuario> robotUsuarios;
  
}
