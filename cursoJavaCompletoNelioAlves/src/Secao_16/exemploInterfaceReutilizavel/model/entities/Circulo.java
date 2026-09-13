package Secao_16.exemploInterfaceReutilizavel.model.entities;

import Secao_16.exemploInterfaceReutilizavel.model.enums.Color;

public class Circulo extends AbstractShape {

    private Double raio;

    public Circulo(Color color, Double raio) {
        super(color);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
