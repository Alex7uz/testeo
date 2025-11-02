package com.clinica_Veterinaria.cliVete.Repository;

import com.clinica_Veterinaria.cliVete.Model.Amo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAmoRepository extends JpaRepository<Amo, Long> {
}
