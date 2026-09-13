package Secao_16.exemploComInterface.model.services;

public class TaxaBrazilService implements TaxService {


    @Override
    public double tax(double valor) {
        if (valor <= 100.0) {
            return valor * 0.2;
        } else {
            return valor * 0.15;
        }
    }
}

/*
 public double taxa(double valor) {
        if (valor <= 100.0) {
            return valor * 0.2;
        } else {
            return valor * 0.15;
        }
    }
 */