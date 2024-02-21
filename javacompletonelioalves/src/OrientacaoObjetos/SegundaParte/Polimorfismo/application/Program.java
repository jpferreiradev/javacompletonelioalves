package OrientacaoObjetos.SegundaParte.Polimorfismo.application;

import OrientacaoObjetos.SegundaParte.Polimorfismo.entities.Conta;
import OrientacaoObjetos.SegundaParte.Polimorfismo.entities.ContaPoupanca;
import OrientacaoObjetos.SegundaParte.Polimorfismo.entities.ContaNegocios;

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
