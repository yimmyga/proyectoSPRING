package com.proyectoSPRING.proyectoSPRING.controlador1;


import com.proyectoSPRING.proyectoSPRING.dao.IpersonaDao;
import com.proyectoSPRING.proyectoSPRING.entidades.Persona;
import com.proyectoSPRING.proyectoSPRING.servicio.IIndexServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yimmy Sipion
 */
//Este es un controlador y recibe las peticiones, las interfaces es para la declaracion de metodos y la clase servicio es la implementacion de todos los metodos

@RestController
@RequestMapping("Index")

public class IndexController {
      @Autowired
     IpersonaDao PersonaDao;
  
    @Autowired
    public IIndexServicio iindeservicio;
    @GetMapping("mensaje")
    public String mensaje() {
        String mensajeServicio = iindeservicio.devolvermensaje();
        return "yimmy"+mensajeServicio;
    }
    
    @GetMapping("sipion")
    public String sipion (){
        return "hola";
    }
    
    
    @GetMapping("obtenerpersona")
    @Autowired
    public  Persona getPersona(){
          return PersonaDao.findOne(new Long(1));
        
    }
  
    
    
   
    
    }
    
 

