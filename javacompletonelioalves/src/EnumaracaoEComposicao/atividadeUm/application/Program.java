package EnumaracaoEComposicao.atividadeUm.application;

import EnumaracaoEComposicao.atividadeUm.application.entities.Departamento;
import EnumaracaoEComposicao.atividadeUm.application.entities.Trabalhador;
import EnumaracaoEComposicao.atividadeUm.application.entities.enums.NivelTrabalho;

import java.util.Scanner;

public class Program {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o departamento:");
        String nomeDepartamento = scan.nextLine();
        System.out.print("Entre com os dados do trabalhador:");
        System.out.println();
        System.out.print("Nome:");
        String trabalhoNome = scan.nextLine();
        System.out.print("Nível:");
        String nivelTrabalhador = scan.nextLine();
        System.out.print("Base salarial:");
        double salarioBase = scan.nextDouble();


        Trabalhador trabalhador = new Trabalhador(trabalhoNome, NivelTrabalho.valueOf(nivelTrabalhador),salarioBase, new Departamento(nomeDepartamento)); // Instanciação do trabalhador






    }
}
