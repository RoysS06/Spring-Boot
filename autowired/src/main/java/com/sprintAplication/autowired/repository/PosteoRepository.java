package com.sprintAplication.autowired.repository;

import com.sprintAplication.autowired.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository implements IPosteoRepository{

    @Override
    public List<Posteo> traerTodos() {
        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L, "Como comprar una PC", "Roy Rodriguez"));
        listaPosteos.add(new Posteo(2L, "Como enseñar fotografía de estudio", "Diana Rios"));
        
        return listaPosteos;
    }
    
    
    
}
