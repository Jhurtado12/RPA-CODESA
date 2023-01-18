/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.rpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "usuario")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long id;

    private String nombre;

    private String apellido;

    private String email;

    private String estado;
    
    private String telefono;

    /*RELACIONES 1*/
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "usuario", cascade = {CascadeType.ALL})
    private Set<RobotUsuario> robotUsuario;
 
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "usuario", cascade = {CascadeType.ALL})
    private Set<Log> logs;
    
    /* --------------------------------------------------------------------------------------------------- */

    /*RELACIONES 2*/
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "rol_idRol", insertable = false, updatable = false)
    private Rol roles;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "empresas_idEmpresa", insertable = false, updatable = false)
    private Empresa empresa;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "area_idArea", insertable = false, updatable = false)
    private Area area;

}
