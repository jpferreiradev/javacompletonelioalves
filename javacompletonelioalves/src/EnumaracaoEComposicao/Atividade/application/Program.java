package EnumaracaoEComposicao.Atividade.application;

import EnumaracaoEComposicao.Atividade.entities.Cliente;
import EnumaracaoEComposicao.Atividade.entities.Ordem;
import EnumaracaoEComposicao.Atividade.entities.OrdemPedido;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY HH:mm:ss");


        System.out.println("Insira os dados do cliente:");
        System.out.print(" Nome: ");
        String nomeCliente = scan.next();
        System.out.print(" Email: ");
        String emailCliente = scan.next();
        System.out.println(" Data de aniversário: ");
        String dataAniversario = scan.next();
        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        String dadosPedido = scan.next();
        Ordem ordem = new Ordem(new Date(df.format("20/04/2018 11:25:09")));
        Cliente cliente = new Cliente(nomeCliente,emailCliente,new Date(df.format(dataAniversario)));









    }
}

/*
 */