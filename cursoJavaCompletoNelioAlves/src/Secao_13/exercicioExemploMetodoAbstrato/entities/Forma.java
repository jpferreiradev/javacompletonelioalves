package Secao_13.exercicioExemploMetodoAbstrato.entities;


import Secao_13.exercicioExemploMetodoAbstrato.entities.enums.Cor;

public abstract class Forma {

    private Cor cor;

    public Forma(){

    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract double area();


}
