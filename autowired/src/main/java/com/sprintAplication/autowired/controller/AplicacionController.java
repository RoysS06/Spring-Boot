package com.sprintAplication.autowired.controller;

import com.sprintAplication.autowired.model.Posteo;
import com.sprintAplication.autowired.repository.IPosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AplicacionController {
    
    @Autowired
    IPosteoRepository repo;
    
    @GetMapping("/posteos")
    public List<Posteo> traerTodos(){
        return repo.traerTodos();
    }
    
}
