package com.clinica_Veterinaria.cliVete.Service;

import com.clinica_Veterinaria.cliVete.Model.Mascota;


import java.util.List;

public interface IMascotaService {

    public Mascota saveMascota(Mascota masco);

    public List<Mascota> traerMascotas();

    public Mascota findMacota(Long id);

    public String eliminarMascota(Long id);

    public void editMascota(Long id,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor);

    public Mascota guardarMascota(Mascota mascota);

}
