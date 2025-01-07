package com.restaurante.ejercicioPractico1.controller;

import com.restaurante.ejercicioPractico1.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

        @GetMapping("/platos/{num_plato}")
        @ResponseBody
        public Plato traerPlatos(@PathVariable int num_plato) {

            List<Plato> listaPlatos = new ArrayList<Plato>();
            listaPlatos.add(new Plato(1, "Tallarines", 3.20, "Rico plato rojo"));
            listaPlatos.add(new Plato(2, "Lomo Saltado", 15.5, "Planto peruano oriental"));
            listaPlatos.add(new Plato(3, "Aji de gallina", 30.1, "Plato a base de leche y palillo"));
            
            for(Plato plat: listaPlatos){
                if(plat.getNum() == num_plato){
                    return plat;
                }
            }
            
            return null;


        }

}
