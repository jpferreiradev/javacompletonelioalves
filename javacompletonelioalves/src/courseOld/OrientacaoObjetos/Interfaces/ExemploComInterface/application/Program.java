package courseOld.OrientacaoObjetos.Interfaces.ExemploComInterface.application;

import courseOld.OrientacaoObjetos.Interfaces.ExemploComInterface.model.entities.CarRental;
import courseOld.OrientacaoObjetos.Interfaces.ExemploComInterface.model.entities.Vehicle;
import courseOld.OrientacaoObjetos.Interfaces.ExemploComInterface.model.services.BrazilTaxService;
import courseOld.OrientacaoObjetos.Interfaces.ExemploComInterface.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Escolha da forma da data


        // Ler os dados do usuario
        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = scan.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm):  ");
        LocalDateTime star = LocalDateTime.parse(scan.nextLine(),fmt);
        System.out.print("Retorno(dd/MM/yyyy hh:mm):  ");
        LocalDateTime finish = LocalDateTime.parse(scan.nextLine(),fmt);

        CarRental cr = new CarRental(star,finish,new Vehicle(carModel)); // Instanciando o objeto do carro

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = scan.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = scan.nextDouble();

        // Aqui temos um exemplo de Upcasting, o BrazilTaxService, essa classe é um subtipo de TaxService
        RentalService rentalService = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("Fatura: ");
        System.out.println("Pagamento básico: " + String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f",cr.getInvoice().getTotalPayment()));
    }
}

/*
        BrazilTaxService taxService = new BrazilTaxService();
        System.out.println(taxService.tax(390.0));

 */