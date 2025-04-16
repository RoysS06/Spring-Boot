package com.jpaAplication.pruebaJPA.service;

import com.jpaAplication.pruebaJPA.model.Persona;
import com.jpaAplication.pruebaJPA.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private IPersonaRepository persoRepo;
    
    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void editPersona(Persona perso) {
        this.savePersona(perso);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public List<Persona> getPersonas() {
        List <Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }
    
    

}
