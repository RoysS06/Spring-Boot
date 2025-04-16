package com.jpaAplication.pruebaJPA.service;

import com.jpaAplication.pruebaJPA.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
    //CREAR
    public void saveMascota(Mascota masco);
    
    //ELIMINAR
    public void deleteMascota(Long id_mascota);
    
    //EDITAR
    public void editMascota(Mascota masco);
    
    //LECTURA INDIVIDUAL
    public Mascota findMascota(Long id_mascota);
    
    //LECTURA GRUPAL
    public List<Mascota> getMascotas();
}
