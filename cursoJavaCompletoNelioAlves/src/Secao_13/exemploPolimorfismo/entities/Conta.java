package Secao_13.exemploPolimorfismo.entities;

public class Conta {

    private Integer numero;
    private String titular;
    protected Double saldoDaConta;

    public Conta() {

    }

    public Conta(Integer numero, String titular, Double saldoDaConta) {
        this.numero = numero;
        this.titular = titular;
        this.saldoDaConta = saldoDaConta;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void saque(double saldo) {
        saldoDaConta -= saldo + 5.0;
    }

    public void deposito(double saldo) {
        saldoDaConta += saldo;
    }

}

