package com.ejemplo.patronDTO.aplicacionController;

import com.ejemplo.patronDTO.Inquilino;
import com.ejemplo.patronDTO.Propiedad;
import com.ejemplo.patronDTO.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AlquileresController {
    
    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        
        Propiedad prop = new Propiedad(1L, "Casa", "Av. Penueria - Lima", 200.0, 40000.0);
        Inquilino inqui = new Inquilino(15L, "4778855", "Ramiro", "Prialé", "Conductor");
        
        PropiedadDTO propiDTO = new PropiedadDTO();
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setNombre(inqui.getNombre());
        propiDTO.setApellido(inqui.getApellido());
        
        return propiDTO;
    
    }
    
}
