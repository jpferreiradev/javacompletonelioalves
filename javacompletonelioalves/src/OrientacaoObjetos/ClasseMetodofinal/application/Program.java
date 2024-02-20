package OrientacaoObjetos.ClasseMetodofinal.application;

import OrientacaoObjetos.ClasseMetodofinal.entities.Conta;
import OrientacaoObjetos.ClasseMetodofinal.entities.ContaNegocios;
import OrientacaoObjetos.ClasseMetodofinal.entities.ContaPoupanca;

public class Program {
    public static void main(String[] args) {

        Conta acc1 = new Conta(1001,"Alex",1000.0);
        acc1.saque(200.0);
        System.out.println(acc1.getSaldo());

        Conta acc2 = new Conta(1002,"Maria",1000.0);
        acc2.saque(100);
        System.out.println(acc2.getSaldo());


        Conta acc3 = new ContaPoupanca(1003,"Teste",1000.0,0.01);
        // Uso do saque sobreposto da classe Conta
        acc3.saque(200.0);
        System.out.println(acc3.getSaldo());

        Conta acc4 = new ContaNegocios(1004,"Bob", 1000.0,500.0);
        acc4.saque(200.0);
        System.out.println(acc4.getSaldo());






    }
}
