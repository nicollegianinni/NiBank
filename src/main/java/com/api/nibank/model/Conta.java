package com.api.nibank.model;

import javax.persistence.*;

@Entity
@Table(name = "conta")
public class Conta {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;

    private String banco;
    private int numeroAgencia;
    private int numeroConta;

    //chave estrangeira foreign key
    private Cliente cliente;


    //metodo construtor


    public Conta(Long idConta, String banco, int numeroAgencia, int numeroConta, Cliente cliente) {
        this.idConta = idConta;
        this.banco = banco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    //metodo construtor sem parametro
    public Conta() {
    }

    //gett e sett
    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
