package com.jpaAplication.pruebaJPA.service;

import com.jpaAplication.pruebaJPA.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    // ALTA
    public void savePersona(Persona perso);
    
    //ELIMINACIÓN
    public void deletePersona(Long id);
    
     // LECTURA DE TODOS
    public List<Persona> getPersonas();
    
    // LECTURA DE 1 SOLA PERSONA
    public Persona findPersona(Long id);
    
    // MODIFICACIÓN
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);
    
    
}
