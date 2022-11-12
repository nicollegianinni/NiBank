package com.api.nibank.model;

import javax.persistence.*;

@Entity
@Table(name = "agencia")
public class Agencia {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgencia;

    private String banco;
    private String tipoConta;
    private int numAgencia;
    private int numConta;
    private double saldo = 100.00;

    //chave estrangeira foreign key
    private Conta conta;


    //metodo construtor
    public Agencia(Long idAgencia, String banco, String tipoConta, int numAgencia, int numConta, double saldo, Conta conta) {
        this.idAgencia = idAgencia;
        this.banco = banco;
        this.tipoConta = tipoConta;
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.conta = conta;
    }


    //metodo construtor sem parametro
    public Agencia() {
    }


    //gett e sett
    public Long getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Long idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        tipoConta = tipoConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }


}
