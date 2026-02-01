package JavaBasico.TopicosImportantesJava;

public class OperacaoSplit {
    static void main() {

        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        for(int i = 0; i < vect.length; i++){
            System.out.printf(" " + vect[i]);
        }
    }
}
