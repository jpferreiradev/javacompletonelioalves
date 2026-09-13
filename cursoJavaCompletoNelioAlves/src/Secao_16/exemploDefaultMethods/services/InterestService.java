package Secao_16.exemploDefaultMethods.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getTaxaDeJuros();


    // Aqui que está o exemplo de métodos default nas interfaces
    default double pagamento(double quantia, double mes) {
        if (mes < 1) {
            throw new InvalidParameterException("Meses devem ser maiores que zero"); // Programação defensiva
        }
        return quantia * Math.pow(1.0 + getTaxaDeJuros() / 100.0, mes);
    }
}
