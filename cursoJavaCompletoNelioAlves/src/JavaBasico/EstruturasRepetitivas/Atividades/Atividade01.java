package JavaBasico.EstruturasRepetitivas.Atividades;

public class Atividade01 {
    static void main() {

        System.out.println("NÚMEROS PARES");
        for(int i = 1; i <= 1000;i++){
            System.out.printf(" " + i);
        }

        System.out.println();
        System.out.println("NUMERO IMPARES:");
        for(int i = 1; i <= 1000;i++){
            if(i % 2 != 0){
                System.out.printf(" " + i);
            }
        }
    }
}
