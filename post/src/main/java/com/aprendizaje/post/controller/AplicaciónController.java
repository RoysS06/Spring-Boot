package com.aprendizaje.post.controller;

import com.aprendizaje.post.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AplicaciónController {
    
    @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cli){
    
        System.out.println("Cliente creado");
        System.out.println("Nombre del cliente: " + cli.getNombre());
        System.out.println("Apellido del cliente: " + cli.getApellido());
        
    }
}
