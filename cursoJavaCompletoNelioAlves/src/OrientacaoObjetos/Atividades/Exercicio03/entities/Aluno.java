package OrientacaoObjetos.Atividades.Exercicio03.entities;

public class Aluno {


    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public Aluno() {

    }

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void conversaoMediaPonderada() {


        double somaNotas = nota1 + nota2 + nota3;
        if (somaNotas > 60) {
            System.out.println("FINAL GRAND " + somaNotas);
            System.out.println("PASS");


        } else {
            double sobraNota = 60 - somaNotas;

            System.out.println("FINAL GRAND " + somaNotas);
            System.out.println("FAILED");
            System.out.println("MISSING " + sobraNota + " POINTS");
        }
    }
}
