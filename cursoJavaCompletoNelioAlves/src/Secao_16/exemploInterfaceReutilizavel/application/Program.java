package Secao_16.exemploInterfaceReutilizavel.application;

import Secao_16.exemploInterfaceReutilizavel.model.entities.AbstractShape;
import Secao_16.exemploInterfaceReutilizavel.model.entities.Circulo;
import Secao_16.exemploInterfaceReutilizavel.model.entities.Retangulo;
import Secao_16.exemploInterfaceReutilizavel.model.entities.Shape;
import Secao_16.exemploInterfaceReutilizavel.model.enums.Color;

public class Program {
    static void main() {


        AbstractShape s1 = new Circulo(Color.BLACK,2.0);
        AbstractShape s2 = new Retangulo(Color.WHITE,3.0,4.0);

        System.out.println("Circulo cor: " + s1.getColor());
        System.out.println("Circulo area: " + String.format("%.3f", s1.area()));
        System.out.println("Retangulo cor: " + s2.getColor());
        System.out.println("Retangulo area: " + String.format("%.3f", s2.area()));
    }
}
