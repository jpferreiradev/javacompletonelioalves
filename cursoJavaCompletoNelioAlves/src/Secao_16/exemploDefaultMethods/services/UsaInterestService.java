package Secao_16.exemploDefaultMethods.services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {

    private double taxaDeJuros;

    public UsaInterestService(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }


}
