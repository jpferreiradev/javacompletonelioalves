package exercicios_Curso.secao10.dadosPessoas.entities;

public class Pessoa {

    private double altura;
    private char sexo;

    public Pessoa(){

    }
    public Pessoa(double altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa - Altura:" + altura + ", Sexo:" + sexo;

    }
}
