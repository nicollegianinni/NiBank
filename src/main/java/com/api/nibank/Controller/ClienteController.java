package com.api.nibank.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")

public class ClienteController {

    @GetMapping("/{id}")
    public void dados(@PathVariable Long idCliente) {

    }

    @PutMapping("/{id}")
    public void alterarDados(@RequestBody Long idCliente) {

    }

//    @DeleteMapping("/deletar/{id}")
//    public void detelarCliente
//
//    {

    }











