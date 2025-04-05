package com.sprintAplication.estaturas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Jugador {
    
    private Long id;
    private String apellido;
    private int edad;
    private double peso;
    private double estatura;

    public Jugador() {
    }
    
    public Jugador(Long id, String apellido, int edad, double peso, double estatura) {
        this.id = id;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    
    
}
