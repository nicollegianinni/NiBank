package com.api.nibank.Controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/agencia")
public class AgenciaController {



    @PostMapping("/cadastrar")
    public void cadastrarNovo ( @RequestBody Long idCliente) {

    }
    @PostMapping("/transferir/{id}")
    public void transferir ( @RequestBody Long idConta) {

    }

    @GetMapping("/extrato/{id}")
    public void extrato ( @PathVariable Long idConta) {

    }
    @GetMapping("/contasExistentes/all")
    public void TodasContas( @PathVariable Long idConta) {

    }




}
