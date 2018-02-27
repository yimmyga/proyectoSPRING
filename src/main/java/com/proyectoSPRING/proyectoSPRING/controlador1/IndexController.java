package com.proyectoSPRING.proyectoSPRING.controlador1;


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
//Este es un controlafor
@RestController
@RequestMapping("Index")
public class IndexController {

    @GetMapping("mensaje")
    public String mensaje() {
        return "yimmy";
    }
    
    @GetMapping("sipion")
    public String sipion (){
        return "hola";
    }
    
    }
    
 

