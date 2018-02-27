/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoSPRING.proyectoSPRING.dao;

import com.proyectoSPRING.proyectoSPRING.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Yimmy Sipion
 */
public interface IpersonaDao extends JpaRepository<Persona, Long>{
    
}
