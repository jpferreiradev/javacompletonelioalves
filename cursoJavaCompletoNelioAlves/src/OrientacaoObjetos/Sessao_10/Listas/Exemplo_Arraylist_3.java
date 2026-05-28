package OrientacaoObjetos.Sessao_10.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo_Arraylist_3 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);



        System.out.println("Informe o total de notas: ");
        int valor = scan.nextInt();

        List<Double> notas = new ArrayList<>();

        for(int i = 0; i < valor; i++){
            notas.add(scan.nextDouble());
        }

        System.out.println("Essas são as notas: ");
        for(double n : notas){
            System.out.println(n);
        }








    }
}
