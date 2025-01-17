package courseOld.OrientacaoObjetos.UpcastingDowncasting.application;

import courseOld.OrientacaoObjetos.UpcastingDowncasting.entities.Conta;
import courseOld.OrientacaoObjetos.UpcastingDowncasting.entities.ContaNegocios;
import courseOld.OrientacaoObjetos.UpcastingDowncasting.entities.ContaPoupanca;

public class Program {
    public static void main(String[]args){

        Conta acc = new Conta(1001,"Alex",0.0);
        ContaNegocios bacc = new ContaNegocios(1002,"Maria",0.0,500.0);

        // UPCASTING
        Conta acc1 = bacc;
        Conta acc2 = new ContaNegocios(1003,"Bob",0.0,200.0);
        Conta acc3 = new ContaPoupanca(1004,"Ana",0.0,0.01);

        // DOWNCASTING

        ContaNegocios acc4 = (ContaNegocios) acc2; // Casting manual
        acc4.emprestimo(100.0);

        //ContaNegocios acc5 = (ContaNegocios) acc3;
        if(acc3 instanceof ContaNegocios){
            ContaNegocios acc5 = (ContaNegocios) acc3;
            acc5.emprestimo(200.0);
            System.out.println("Emprestimo!");
        }

        if(acc3 instanceof ContaPoupanca){
            ContaPoupanca acc5 = (ContaPoupanca) acc3;
            acc5.updateSaldo();
            System.out.println("Update!");
        }

    }
}
