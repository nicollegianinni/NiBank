package com.api.nibank.repository;

import com.api.nibank.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Jpa spring data da cesso a metodos spring boot (save, FindyByAll, delete etc)
                               //modelo e chave primaria

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {


}
