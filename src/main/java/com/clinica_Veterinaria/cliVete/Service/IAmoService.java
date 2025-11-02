package com.clinica_Veterinaria.cliVete.Service;


import com.clinica_Veterinaria.cliVete.Model.Amo;

import java.util.List;

public interface IAmoService {
    
    public Amo saveAmo(Amo amo);

    public List<Amo> traerAmos();

    public Amo findAmo(Long id);

    public String eliminarAmo(Long id);

    public void editAmo(Long id,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevoCelular,
                            int nuevoDNI);
}

