package com.clinica_Veterinaria.cliVete.Controller;

import com.clinica_Veterinaria.cliVete.Model.Amo;
import com.clinica_Veterinaria.cliVete.Service.IAmoService;
import com.clinica_Veterinaria.cliVete.Service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AmoController {
    @Autowired
    private IAmoService amoServ;

    @GetMapping("/duenio/traer")
    public List<Amo> listaDeAmos() {
        return amoServ.traerAmos();
    }

    @PostMapping("/duenio/crear")
    public Amo crearAmo(@RequestBody Amo amo) {
        return amoServ.saveAmo(amo);
    }


}
