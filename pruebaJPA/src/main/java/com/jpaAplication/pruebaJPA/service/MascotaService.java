package com.jpaAplication.pruebaJPA.service;

import com.jpaAplication.pruebaJPA.model.Mascota;
import com.jpaAplication.pruebaJPA.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    private IMascotaRepository repoMasco;

    @Override
    public void saveMascota(Mascota masco) {
        repoMasco.save(masco);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        repoMasco.deleteById(id_mascota);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        Mascota masco = repoMasco.findById(id_mascota).orElse(null);
        return masco;
    }

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = repoMasco.findAll();
         return listaMascotas;
    }
    
}
