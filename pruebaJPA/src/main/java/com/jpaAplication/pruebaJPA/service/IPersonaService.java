package com.jpaAplication.pruebaJPA.service;

import com.jpaAplication.pruebaJPA.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //CREAR
    public void savePersona(Persona perso);
    
    //ELIMINAR
    public void deletePersona(Long id);
    
    //EDITAR
    public void editPersona(Persona perso);
    
    //LECTURA INDIVIDUAL
    public Persona findPersona(Long id);
    
    //LECTURA GRUPAL
    public List<Persona> getPersonas();
    
}
