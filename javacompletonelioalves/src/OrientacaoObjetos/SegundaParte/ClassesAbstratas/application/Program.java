package OrientacaoObjetos.SegundaParte.ClassesAbstratas.application;

import OrientacaoObjetos.SegundaParte.ClassesAbstratas.entities.Conta;
import OrientacaoObjetos.SegundaParte.ClassesAbstratas.entities.ContaNegocios;
import OrientacaoObjetos.SegundaParte.ClassesAbstratas.entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        List<Conta> list = new ArrayList<>(); // Tipo generico

        list.add(new ContaPoupanca(1001,"Alex",500.00,0.01));
        list.add(new ContaNegocios(1002,"Maria",1000.0,400.0));
        list.add(new ContaPoupanca(1004,"Bob",300.0,0.01));
        list.add(new ContaNegocios(1004,"Anna",500.0,500.0));


        double soma = 0;
        for(Conta acc : list){
            soma += acc.getSaldo();
        }


        System.out.printf("Total do saldo: %.2f%n",soma);

        for(Conta acc : list){
            acc.deposito(10.0);
        }
        for(Conta acc: list){
            System.out.printf("Update do saldo das contas %d: %.2f%n",acc.getNumero(),acc.getSaldo());
        }







    }
}

// Nesse exemplo aqui, está usando o polimorfismo, Upcasting

/*
        Conta acc1 = new Conta(1001,"Alex",1000.0);
        Conta acc2 = new ContaPoupanca(1002,"Maria",1000.0,0.01);
        Conta acc3 = new ContaNegocios(1003,"Bob",1000.0,500.0);
 */