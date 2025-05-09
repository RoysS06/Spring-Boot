package com.odontologo.ejercicioPractico2;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Paciente {

    private Long  id;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nac;

    public Paciente() {
    }

    public Paciente(Long id, int dni, String nombre, String apellido, LocalDate fecha_nac) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
    }

    
    
}
