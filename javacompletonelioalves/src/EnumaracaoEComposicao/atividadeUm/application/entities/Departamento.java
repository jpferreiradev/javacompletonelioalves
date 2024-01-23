package EnumaracaoEComposicao.atividadeUm.application.entities;

import java.awt.*;

public class Departamento {

    private String name;

    public Departamento(){

    }
    public Departamento(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
