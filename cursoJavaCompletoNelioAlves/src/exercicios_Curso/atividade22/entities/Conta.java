package exercicios_Curso.atividade22.entities;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Conta(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        depositar(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double deposito) {
        saldo -= deposito + 5.0;
    }

    public String toString() {
        return "Conta: Número: " + numero + ", Nome:  " + nome + ", Saldo: R$ " + String.format("%.2f", saldo);
    }
}
