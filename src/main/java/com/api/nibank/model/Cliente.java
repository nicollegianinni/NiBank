package com.api.nibank.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "cliente")
public class Cliente {

    //Atributos
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    private String cpf;
    @NotBlank
    private String email;
    @NotBlank
    private String endereco;


    //metodo construtor
    public Cliente(String cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    //metodo construtor sem parametro
    public Cliente() {
    }

    //getts e setts
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
