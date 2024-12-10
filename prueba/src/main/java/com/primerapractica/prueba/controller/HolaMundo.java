package com.primerapractica.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    
    @GetMapping("/imc")
    public String pesoSuma(@RequestParam double imc_paciente){
        
        String pesoEstado = "";
        
        if(imc_paciente<=18.5){
            pesoEstado = "Insuficiente";
        }
        else if(imc_paciente>=18.6 && imc_paciente<=24.9){
            pesoEstado = "Normal";
        }
        else if(imc_paciente>=25.0 && imc_paciente<=29.9){
            pesoEstado = "Sobrepeso";
        }
        else if(imc_paciente>=30){
            pesoEstado = "Obesidad";
        }
        
        return "El diagnostico del paciente es: " + pesoEstado;
    }
    
}
