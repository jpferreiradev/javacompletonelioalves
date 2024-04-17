package OrientacaoObjetos.Interfaces.Exemplo.model.services;

import OrientacaoObjetos.Interfaces.Exemplo.model.entities.CarRental;
import OrientacaoObjetos.Interfaces.Exemplo.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService ;
    }

    public void processInvoice(CarRental carRental) {

        // Diferença entre ( dois instantes) horas do inicio e fim
        double minutes = Duration.between(carRental.getStar(), carRental.getFinish()).toMinutes(); // Diferença entre minutos
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
