package Secao_14.atividadeFixacao.entities;

import Secao_14.atividadeFixacao.exceptions.RegraNegocioException;

public class Conta {

    private Integer numero;
    private String nomeTitular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {

    }

    public Conta(Integer numero, String nomeTitulartitular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.nomeTitular = nomeTitulartitular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNomeTitularTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String titular) {
        this.nomeTitular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void sacar(Double valor) {
        validarSaque(valor);
        saldo -= valor;
    }

    private void validarSaque(double valor) {
        if (valor > getLimiteSaque()) {
            throw new RegraNegocioException("Erro de saque: A quantia excede o limite de saque"); // Excesão personalizada
        }
        if (valor > getSaldo()) {
            throw new RegraNegocioException("Erro de saque: Saldo insuficiente");
        }
    }

}
