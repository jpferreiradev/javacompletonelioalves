package courseOld.OrientacaoObjetos.Interfaces.ExemploComInterface.model.services;

import courseOld.OrientacaoObjetos.Interfaces.ExemploComInterface.model.entities.CarRental;
import courseOld.OrientacaoObjetos.Interfaces.ExemploComInterface.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    // Composição de objetos, por isso que ele utiliza o BrazilTaxService, mas aqui ele depende da inteface TaxSercvice
    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        //Encontra a duração entre dois instantes, aqui encontrar duração covertido em minutos
        double minutes = Duration.between(carRental.getStar(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment; // Variavel do pagamento basico
        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours); // Math.ceil, fazendo o arredondamento pra cima
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }
        double tax = taxService.tax(basicPayment); // Calculo do imposto

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }


}

