package CourseReview.JavaBasico.OperadoresBitwise;

public class OperadorSlipExemploDois {
    public static void main(String[] args) {

        String meuNome = "João Paulo Santos Ferreira";

        String [] nome = meuNome.split(" -  "); // Aqui

        String um = nome[0];
        String dois = nome[1];
        String tres = nome[2];
        String quatro = nome[3];

        for(String s : nome){
            System.out.printf(" " + s);
        }


    }
}
