package CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.QuartaQuestao.entities;

public class Estudante {


    public String nome;
    public double primeiroSemestre;
    public double segundoSemestre;
    public double tercerioSemestre;

    public void somaSemestre() {
        double somaNotas = (primeiroSemestre + segundoSemestre + tercerioSemestre);
        if (somaNotas > 60.0) {
            System.out.printf("FINAL GRADE  %.2f%n", somaNotas);
            System.out.println("PASS");
        } else {
            double valorFalta = 60 - somaNotas ;
            System.out.printf("FINAL GRADE = %.2f%n", somaNotas);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f %s ", valorFalta," POINTS");
        }


    }

}
