package OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.entities;

import OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.entities.enums.Cor;

public abstract class Forma {

    private Cor cor;

    Forma(){

    }
    Forma(Cor cor){
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
