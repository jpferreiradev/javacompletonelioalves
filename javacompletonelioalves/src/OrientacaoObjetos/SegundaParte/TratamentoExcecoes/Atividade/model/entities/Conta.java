package OrientacaoObjetos.SegundaParte.TratamentoExcecoes.Atividade.model.entities;

import OrientacaoObjetos.SegundaParte.TratamentoExcecoes.Atividade.model.exceptions.ExceptionNumero;

public class Conta {

    private Integer numero;
    private String nome;
    private Double saldo;
    private Double limiteDeSaque;

    public Conta() {

    }

    public Conta(Integer numero, String nome, Double saldo, Double limiteDeSaque) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }


    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }


    public void deposito(double valorDeposito) {
        System.out.println("Novo saldo:" + (saldo += valorDeposito));
    }

    public void sacar(double valorSaque) {

        validaSaque(valorSaque);
        System.out.println("Novo saldo:" + (saldo -= valorSaque));


    }

    private void validaSaque(double valorSaque) {
        if (limiteDeSaque < valorSaque) {
            throw new ExceptionNumero("Erro de retirada: o valor excede o limite de retirada");
        }
        if (limiteDeSaque > saldo) {
                throw new ExceptionNumero("Erro de retirada: saldo insuficiente");
            }
        }

    }



/*
    if (getLimiteDeSaque() < valorSaque) {
            System.out.println("Erro de retirada: o valor excede o limite de retirada");
        } else if (getLimiteDeSaque() > saldo) {
            System.out.println("Erro de retirada: saldo insuficiente");
 */





