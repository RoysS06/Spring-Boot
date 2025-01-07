package com.odontologo.ejercicioPractico2.controller;

import com.odontologo.ejercicioPractico2.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdontologoController {

    @GetMapping("/pacientes")
    public List<Paciente> traerPacientes() {
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(new Paciente(1L, 47731468, "Ernesto", "Caballero", LocalDate.of(2016, 8, 18)));
        listaPacientes.add(new Paciente(2L, 12258111, "Fabio", "Silva", LocalDate.of(1960, 1, 20)));
        listaPacientes.add(new Paciente(3L, 78598744, "James", "Ahon", LocalDate.of(2008, 12, 25)));
        listaPacientes.add(new Paciente(4L, 99988877, "Arturo", "Carpenter", LocalDate.of(2015, 6, 27)));
        listaPacientes.add(new Paciente(5L, 55224242, "Valentin", "Avila", LocalDate.of(1958, 5, 13)));

        return listaPacientes;
    }

    @GetMapping("/pacientes/menores")
    @ResponseBody
    public List<Paciente> traerMenores() {
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(new Paciente(1L, 47731468, "Ernesto", "Caballero", LocalDate.of(2016, 8, 18)));
        listaPacientes.add(new Paciente(2L, 12258111, "Fabio", "Silva", LocalDate.of(1960, 1, 20)));
        listaPacientes.add(new Paciente(3L, 78598744, "James", "Ahon", LocalDate.of(2008, 12, 25)));
        listaPacientes.add(new Paciente(4L, 99988877, "Arturo", "Carpenter", LocalDate.of(2015, 6, 27)));
        listaPacientes.add(new Paciente(5L, 55224242, "Valentin", "Avila", LocalDate.of(1958, 5, 13)));
        
        List<Paciente> listaMenores = new ArrayList<Paciente>();
        
        for( Paciente pac : listaPacientes){
            LocalDate hoy = LocalDate.now();
            Period cant_anios = Period.between(pac.getFecha_nac(), hoy);
            
            if(cant_anios.getYears() <18){
                listaMenores.add(pac);
            }
        }
        
        return listaMenores;
    }

}
