package Secao_16.exemploInterfaceReutilizavel.model.entities;

import Secao_16.exemploInterfaceReutilizavel.model.enums.Color;

public class Retangulo extends AbstractShape {

    private double largura;
    private double altura;

    public Retangulo(Color color, double largura, double altura) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}
