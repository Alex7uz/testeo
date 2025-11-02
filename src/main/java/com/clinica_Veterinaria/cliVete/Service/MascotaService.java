package com.clinica_Veterinaria.cliVete.Service;

import com.clinica_Veterinaria.cliVete.Model.Amo;
import com.clinica_Veterinaria.cliVete.Model.Mascota;
import com.clinica_Veterinaria.cliVete.Repository.IAmoRepository;
import com.clinica_Veterinaria.cliVete.Repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;
    @Autowired
    private IAmoRepository amoRepo;



    @Override
    public Mascota saveMascota(Mascota masco) {
        return mascoRepo.save(masco);
    }

    @Override
    public List<Mascota> traerMascotas() {
        List<Mascota> listaDeMascotas = mascoRepo.findAll();
        return listaDeMascotas;
    }

    @Override
    public Mascota findMacota(Long id) {
        Mascota masco = mascoRepo.findById(id).orElse(null);
        return masco;
    }

    @Override
    public String eliminarMascota(Long id) {
        mascoRepo.deleteById(id);
        return "MascotaEliminada";
    }

    @Override
    public void editMascota(Long id,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor) {

        Mascota masco = this.findMacota(id);
        masco.setNombre(nuevoNombre);
        masco.setEspecie(nuevaEspecie);
        masco.setRaza(nuevaRaza);
        masco.setColor(nuevoColor);
        mascoRepo.save(masco);
    }


    public Mascota guardarMascota(Mascota mascota) {
        Long idAmo = mascota.getAmo().getId();
        Amo amo = amoRepo.findById(idAmo).orElseThrow(null);
        mascota.setAmo(amo);
        return mascoRepo.save(mascota);
    }


}
