package Secao_16.exemploSemInterface.application;

import Secao_16.exemploSemInterface.model.entities.AluguelCarro;
import Secao_16.exemploSemInterface.model.entities.Veiculo;
import Secao_16.exemploSemInterface.model.services.AluguelService;
import Secao_16.exemploSemInterface.model.services.TaxaBrazilService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Editar a data


        System.out.println("Entre com os dados do aluguel");
        System.out.print("Entre com o modelo do carro: ");
        String modeloDoCarro = scan.nextLine();
        System.out.print("Hora Retirada (dd/MM/yyyy hh:mm:) ");
        LocalDateTime inicio = LocalDateTime.parse(scan.nextLine(), fmt);
        System.out.print("Hora Retirada (dd/MM/yyyy hh:mm:) ");
        LocalDateTime retorno = LocalDateTime.parse(scan.nextLine(), fmt);

        AluguelCarro carro = new AluguelCarro(inicio, retorno, new Veiculo(modeloDoCarro)); // Associação com o objeto veiculo

        System.out.print("Entre com o preço por hora: ");
        double precoHora = scan.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoDia = scan.nextDouble();

        AluguelService aluguelService = new AluguelService(precoHora, precoDia, new TaxaBrazilService());

        aluguelService.processoAluguel(carro); // Composição

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + carro.getFatura().getPagamentoBasico());
        System.out.println("Imposto: " + carro.getFatura().getImposto());
        System.out.println("Pagamento total: " + carro.getFatura().getPagamentoTotal());


        scan.close();
    }
}
