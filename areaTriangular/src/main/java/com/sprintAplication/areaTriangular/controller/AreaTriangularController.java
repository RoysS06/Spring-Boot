package com.sprintAplication.areaTriangular.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaTriangularController {
    
    @GetMapping("/areaTriangulo")
    public String calcularArea(@RequestParam int base,
                                               @RequestParam int altura){
    
        double resultado = ((base*altura)/2);
        
        return "El resultado del área triangular es: " + resultado;
    }

}
