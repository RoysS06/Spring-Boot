package com.restaurante.ejercicioPractico1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Plato {
    
    private int num;
    private String nombre;
    private double precio;
    private String descripcion;

    public Plato() {
    }

    public Plato(int num, String nombre, double precio, String descripcion) {
        this.num = num;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }


    
    
}
