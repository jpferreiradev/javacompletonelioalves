package Secao_13.exemploPolimorfismo.application;


import Secao_13.exemploPolimorfismo.entities.Conta;
import Secao_13.exemploPolimorfismo.entities.ContaPoupanca;

public class Program {
    static void main() {

        Conta x = new Conta(1020,"Alex", 1000.0); // Exemplo de polimorfismo da classe Conta
        Conta y = new ContaPoupanca(1023,"Maria",1000.0,0.01);// Exemplo de polimorfisco da classe ContaPoupanca

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldoDaConta());
        System.out.println(y.getSaldoDaConta());


    }
}
