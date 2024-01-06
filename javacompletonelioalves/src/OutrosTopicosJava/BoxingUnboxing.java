package OutrosTopicosJava;

public class BoxingUnboxing {
    public static void main(String[] args) {

        int x = 20; // tipo valor
        Object obj = x; // Boxing

        System.out.println(obj); // Processo de Boxing

        int y = (int) obj; // Unboxing
        System.out.println(y); // Processo de Unboxing

        // Exemplo Wrapper

        int i= 30;
        Integer objs = i; // Usamos esse exemplo no banco de dados
        int b = objs * 2;
        System.out.println(b);
    }
}
