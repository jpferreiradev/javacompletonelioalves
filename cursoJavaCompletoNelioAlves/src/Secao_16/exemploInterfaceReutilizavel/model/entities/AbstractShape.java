package Secao_16.exemploInterfaceReutilizavel.model.entities;

import Secao_16.exemploInterfaceReutilizavel.model.enums.Color;

public abstract class AbstractShape implements Shape {
    // Você precisou colocar a classe abstratc para implementar a interface Shape
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
