package com.proyectoSPRING.proyectoSPRING.servicio;


import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *99999
 * @author Yimmy Sipion
 */
@Service
public class  IndexServicio implements IIndexServicio {

    @Override  /**se coge de otra clase */
    public String devolvermensaje() {
       return "bienvenido"; //To change body of generated methods, choose Tools | Templates.
    
    }
   
   
    
}
