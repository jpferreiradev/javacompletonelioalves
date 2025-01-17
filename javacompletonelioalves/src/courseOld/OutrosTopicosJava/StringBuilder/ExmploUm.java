package courseOld.OutrosTopicosJava.StringBuilder;

public class ExmploUm {
    public static void main(String[] args) {

        //StringBuilder string1 = new StringBuilder(); // Forma padrão inicial, capacidade de (16) carac;
        //StringBuilder string2 = new StringBuilder(50); // Exemplo da capacidade de caracte(50);
        StringBuilder string1 = new StringBuilder("Bóson Treinamentos"); // Capacidade de 16 caracte + os que estão na String

        System.out.printf(" String 1 = %s%n ", string1.toString());
        System.out.printf(" Capacidade = %d%n", string1.capacity()); // 16 iniciais + 18 (String)
        System.out.printf(" Comprimento = %d%n",string1.length());

        string1.setLength(15); // Aqui você falo que esse objeto tem 15 caract de comprimento;
        System.out.printf("Novo comprimento: %d%n",string1.length());
        System.out.printf("Capacidade = %d%n", string1.capacity());
        System.out.printf("String 1 = %s%n",string1.toString());


    }
}
