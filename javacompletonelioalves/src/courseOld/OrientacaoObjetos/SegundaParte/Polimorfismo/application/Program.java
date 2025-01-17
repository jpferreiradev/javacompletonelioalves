package courseOld.OrientacaoObjetos.SegundaParte.Polimorfismo.application;

import courseOld.OrientacaoObjetos.SegundaParte.Polimorfismo.entities.Conta;
import courseOld.OrientacaoObjetos.SegundaParte.Polimorfismo.entities.ContaPoupanca;

public class Program {
    public static void main(String[] args) {

     // EXEMPLO DE POLIMORFISMO

        Conta x = new Conta(1020,"Alex",1000.0);
        Conta y = new ContaPoupanca(1023,"Maria",1000.0,0.01);

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());







    }
}
