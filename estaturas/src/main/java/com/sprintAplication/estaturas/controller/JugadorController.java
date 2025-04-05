package com.sprintAplication.estaturas.controller;

import com.sprintAplication.estaturas.model.Jugador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadorController {
    

    @PostMapping("/jugadores")
    public String promedioEstaturas (@RequestBody List<Jugador> listaJugadores){
        
        double sumaEstaturas = 0.0;
        double promedioEstaturas = 0.0;
        
        List<Jugador> jugadores = new ArrayList<Jugador>();
        jugadores = listaJugadores;
        
        for( Jugador juga: jugadores){
            sumaEstaturas = sumaEstaturas + juga.getEstatura();
        }
        
        promedioEstaturas = sumaEstaturas / (jugadores.size());
        
        return "Registro exitoso. El promedio de los jugadores registrados es de: " + promedioEstaturas;
        
       
    }
}
