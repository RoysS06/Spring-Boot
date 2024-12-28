package com.aplicacion.response.controller;

import com.aplicacion.response.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
    
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        
            listaClientes.add(new Cliente(1L, "Roy", "Rodriguez"));
            listaClientes.add(new Cliente(2L, "Edu", "Rodriguez"));
            listaClientes.add(new Cliente(3L, "Marco", "Rodriguez"));
            
            return listaClientes;
            
        }
    
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
    
        return new ResponseEntity<>("Esta es una prueba", HttpStatus.OK);
    }
        
    
}
