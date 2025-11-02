package com.clinica_Veterinaria.cliVete.Service;

import com.clinica_Veterinaria.cliVete.Model.Amo;
import com.clinica_Veterinaria.cliVete.Repository.IAmoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmoService implements IAmoService{
    @Autowired
    private IAmoRepository amoRepo;


    @Override
    public Amo saveAmo(Amo amo) {
        return amoRepo.save(amo);
    }

    @Override
    public List<Amo> traerAmos() {
        List<Amo> listaDeAmos = amoRepo.findAll();
        return listaDeAmos;
    }


    @Override
    public Amo findAmo(Long id) {
        Amo amo = amoRepo.findById(id).orElse(null);
        return amo;
    }

    @Override
    public String eliminarAmo(Long id) {
        amoRepo.deleteById(id);
        return "AmoEliminada";
    }

    @Override
    public void editAmo(Long id,
                        String nuevoNombre,
                        String nuevoApellido,
                        int nuevoCelular,
                        int nuevoDNI) {

        Amo amo = this.findAmo(id);
        amo.setNombre(nuevoNombre);
        amo.setApellido(nuevoApellido);
        amo.setCelular(nuevoCelular);
        amo.setDni(nuevoDNI);
        amoRepo.save(amo);
    }
}
