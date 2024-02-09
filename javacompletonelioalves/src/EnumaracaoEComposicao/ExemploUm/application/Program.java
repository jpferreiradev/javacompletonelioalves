package EnumaracaoEComposicao.ExemploUm.application;

import EnumaracaoEComposicao.ExemploUm.entitites.Departamento;
import EnumaracaoEComposicao.ExemploUm.entitites.Trabalhador;
import EnumaracaoEComposicao.ExemploUm.entitites.enums.NivelTrabalhador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Qual o nome do departamento: ");
        String nomeDepartamento = scan.nextLine();
        System.out.println("Insira os dados do trabalhador:  ");
        System.out.print("Nome: ");
        String nomeTrabalhador = scan.nextLine();
        System.out.println("Nível: ");
        String nivelTrabalhador = scan.nextLine();
        System.out.println("Base salarial: ");
        double baseSalario = scan.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), baseSalario, new Departamento(nomeDepartamento));

        System.out.println("Quantos contatos para esse trabalhar?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insira os dados do " + i + "contrato: ");
            System.out.println("Data (DD/MM/YYYY");
            //Date dataContrato = sdf.parse(scan.next());
        }


    }
}
