package com.practica.ejercicioIntegrador1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjercicioController {
    
    
    @GetMapping("/conversion/{galones}")
    public String conversion(@PathVariable double galones){
        
        double litros = galones * 3.78541;
        
        return  "Estas comprando: " + galones + " galones, que equivalen a: " +  litros + " litros. GRACIAS POR SU COMPRA";
    }
    
    
}
