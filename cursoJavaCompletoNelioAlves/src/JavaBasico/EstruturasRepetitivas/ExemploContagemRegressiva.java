package JavaBasico.EstruturasRepetitivas;

public class ExemploContagemRegressiva {
    static void main() {

        System.out.println("EXEMPLO CRESCENTE");
        for(int i = 0; i < 10; i++) {
            System.out.println("Valor de i:" + (i+1));
        }

        System.out.println();

        System.out.println("EXEMPLO DECRESSCENTE");
        for(int i = 10; i >= 0; i--) {
            System.out.println("Valor de i:" + i);
        }
    }
}
