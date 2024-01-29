package EnumaracaoEComposicao.ExemploUm.application;

import EnumaracaoEComposicao.ExemploUm.entitites.Departamento;
import EnumaracaoEComposicao.ExemploUm.entitites.HoraContrato;
import EnumaracaoEComposicao.ExemploUm.entitites.Trabalhador;
import EnumaracaoEComposicao.ExemploUm.entitites.enums.NivelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


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

        for(int i = 1; i <= n;i++){
            System.out.println("Insira os dados do " + i + " contrato");
            System.out.print("Data (DD/MM/YYYY): ");
            Date DataContrato = sdf.parse(scan.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = scan.nextDouble();
            System.out.print("Duração(horas) : ");
            int duracaoDoContrato = scan.nextInt();
            HoraContrato contrato = new HoraContrato(DataContrato,valorPorHora,duracaoDoContrato);
            trabalhador.adicionarContrato(contrato); // Aqui faz o seu contrato ser associado ao trabalhador
        }
        System.out.println();
        System.out.print("Insira o mês e ano para calcular a renda: (MM/YYYY)");
        String mesEAno = scan.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Name: " + trabalhador.getName());
        System.out.println("Departamento:" + trabalhador.getDepartamento().getNome()); // Composição de objetos, entre trabalhador,
        System.out.println("Renda total: " + mesEAno + " : " + trabalhador.rendaAnual(ano,mes));

    }
}


