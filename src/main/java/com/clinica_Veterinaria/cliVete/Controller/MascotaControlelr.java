package com.clinica_Veterinaria.cliVete.Controller;

import com.clinica_Veterinaria.cliVete.Model.Amo;
import com.clinica_Veterinaria.cliVete.Model.Mascota;
import com.clinica_Veterinaria.cliVete.Service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MascotaControlelr {
    @Autowired
    private IMascotaService mascoServ;

    @GetMapping("/mascotas/traer")
    public List<Mascota> listaDeMascotas(){
        return mascoServ.traerMascotas();
    }

    @PostMapping("/mascotas/crear")
    public Mascota crearMascota(@RequestBody Mascota masco){
        return mascoServ.guardarMascota(masco);
    }



}
