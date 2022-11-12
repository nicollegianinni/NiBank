package com.api.nibank.repository;

import com.api.nibank.model.Agencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenciaRepository extends JpaRepository <Agencia , Long> {
}
