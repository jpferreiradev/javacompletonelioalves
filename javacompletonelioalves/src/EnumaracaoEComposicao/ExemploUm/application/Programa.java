package EnumaracaoEComposicao.ExemploUm.application;

import EnumaracaoEComposicao.ExemploUm.entitites.Departamento;
import EnumaracaoEComposicao.ExemploUm.entitites.Trabalhador;
import EnumaracaoEComposicao.ExemploUm.entitites.enums.NivelTrabalhador;

import java.util.Scanner;

public class Programa {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);


        System.out.print("Entre com o nome do  departamento:");
        String nomeDepartamento  = scan.nextLine();
        System.out.println("Informe os dados do trabalhador:");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = scan.nextLine();
        System.out.print("Base salarial: ");
        double baseSalario = scan.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nome,NivelTrabalhador.valueOf(nivelTrabalhador),baseSalario,new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos que esse trabalhador vai ter? ");
        int n = scan.nextInt();

        for(int i = 1; i < n;i++){
            System.out.println("Insira os dados do " + (i + 1) + "contrato");

        }



    }
}


