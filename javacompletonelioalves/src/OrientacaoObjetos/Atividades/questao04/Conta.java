package OrientacaoObjetos.Atividades.questao04;

public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;


    public Conta() {

    }

    public Conta(int numeroConta, String nomeTitular, double inicialSaldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        desposito(inicialSaldo);


    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorSaldo() {
        return saldo;
    }


    public void desposito(double valor) { // Foi utilizado no construtor a chamada desse método
       saldo += valor;
    }
    public void saque(double valor) {
       saldo -= valor + 5.0;

    }

    public String toString(){
        return "Account: "
                + numeroConta
                + ", Holder: "
                +nomeTitular
                + ", Balance: $"
                + String.format("%.2f",saldo);
    }

}


