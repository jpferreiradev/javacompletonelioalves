package Secao_16.exemploDefaultMethods.services;

import java.security.InvalidParameterException;

public class BrazilianInterestService implements InterestService {

    private double taxaDeJuros;

    public BrazilianInterestService(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }


}
