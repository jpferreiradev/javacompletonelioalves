package Secao_12.exemploAtividade.application;


import Secao_12.exemploAtividade.entities.Departamento;
import Secao_12.exemploAtividade.entities.HoraContrato;
import Secao_12.exemploAtividade.entities.Trabalhador;
import Secao_12.exemploAtividade.enums.NivelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //


        System.out.print("Entre com nome do departamento: ");
        String departamentoNome = scan.nextLine();
        System.out.println("Dados do trabalhador:  ");
        System.out.print("Nome:");
        String nomeTrabalhador = scan.nextLine();
        System.out.print("Nível: ");
        String nivelTrabalhador = scan.nextLine();
        System.out.print("Base salário: ");
        double salarioBase = scan.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, salarioBase, NivelTrabalhador.valueOf(nivelTrabalhador), new Departamento(departamentoNome));

        System.out.print("Quantos contratos? ");
        int n = scan.nextInt(); // Ele fez o for porque os contratos é um tipo List
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o #" + i + "contrato: ");
            System.out.print("Entre com a data: DD/MM/YYYY: ");
            Date contratoData = sdf.parse(scan.next());
            System.out.print("Valor por hora: ");
            double hora = scan.nextDouble();
            System.out.print("Duração (horas) do contrato: ");
            int duracao = scan.nextInt();
            HoraContrato contratos = new HoraContrato(contratoData, hora, duracao);
            trabalhador.adicionarContrato(contratos); // Preste ateção aqui, pegar todos os contratos e associar com a classe Trabalhador
        }
        System.out.println();

        System.out.print("Entre com o mês e ano (MM/YY): ");
        String mesEano = scan.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento:" + trabalhador.getDepartamento().getNome()); // Aqui mostra a composição de objetos
        System.out.println("Renda para " + mesEano + ":" + String.format("%.2f", trabalhador.renda(ano, mes)));

        scan.close();

    }
}
