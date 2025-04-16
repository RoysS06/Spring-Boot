package com.jpaAplication.pruebaJPA.controller;

import com.jpaAplication.pruebaJPA.model.Mascota;
import com.jpaAplication.pruebaJPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;

    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco);

        return "Se acaba de CREAR una mascota con éxito";
    }

}
