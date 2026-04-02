package OrientacaoObjetos.Sesao_9.Atividade.entities;

public class Conta {

    private int numeroDaConta;
    private String nomeTitular;
    private double valorDeposito;

    public Conta() {

    }

    public Conta(int numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int numeroDaConta, String nomeTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial); // Ele mudou isso aqui;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    /*
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
       */
    public String getTitular() {
        return nomeTitular;
    }

    public void setTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getvalorDeposito() {
        return valorDeposito;
    }

    /*
    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }
    */
    public double deposito(double valor) {
        return this.valorDeposito += valor;

    }

    public double saque(double valor) {
        return (this.valorDeposito -= valor + 5) ;
    }


    @Override
    public String toString() {
        return String.format("Conta " + getNumeroDaConta() + ", Titular: " + getTitular() + ", Saldo: R$ %.2f",getvalorDeposito());
    }


}
