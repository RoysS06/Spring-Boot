package com.jpaAplication.pruebaJPA.controller;

import com.jpaAplication.pruebaJPA.model.Persona;
import com.jpaAplication.pruebaJPA.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
        private IPersonaService persoServ;
    
    @PostMapping ("/persona/crear")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        
        return "Se acaba de CREAR una persona con éxito";
    }
    
    @GetMapping("/persona/traer")
    public List<Persona> getPersonas() {
        return persoServ.getPersonas();
    }
    
    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        persoServ.deletePersona(id);
        
        return "Se acaba de ELIMINAR una persona con éxito";
    }
    
    @PutMapping("/persona/editar")
    public Persona editPersona(@RequestBody Persona perso){
        persoServ.editPersona(perso);
        
        return persoServ.findPersona(perso.getId());
    }
    
    
    
    
    
    
}
