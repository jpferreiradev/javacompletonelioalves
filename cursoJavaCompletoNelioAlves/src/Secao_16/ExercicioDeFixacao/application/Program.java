package Secao_16.ExercicioDeFixacao.application;

import Secao_16.ExercicioDeFixacao.model.entities.Contrato;
import Secao_16.ExercicioDeFixacao.model.entities.Parcela;
import Secao_16.ExercicioDeFixacao.model.services.ContratoService;
import Secao_16.ExercicioDeFixacao.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int numero = scan.nextInt();
        scan.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(scan.nextLine(), dft);
        System.out.print("Valor do contrato: ");
        double valorTotal = scan.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.print("Entre com o número de parcelas: ");
        int parcela = scan.nextInt();

        ContratoService contratoService = new ContratoService(new PaypalService());
        contratoService.processoDeContrato(contrato,parcela);

        System.out.println("Parcelas: ");
        for(Parcela p : contrato.getParcelas()){
            System.out.println(p);
        }

        scan.close();
    }
}
