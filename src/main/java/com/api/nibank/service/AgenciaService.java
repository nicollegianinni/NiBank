package com.api.nibank.service;

import com.api.nibank.model.Conta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgenciaService {

    List<Conta> findAll();


    Conta findById (Long id) ;


    Conta save (Conta conta);

}



