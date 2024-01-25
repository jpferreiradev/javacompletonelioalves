package EstruturaDeDados.Vetores.Atividades.Pensionato;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = scan.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scan.nextLine(); // É preciso limpar a quebra de linha do buffer
            String name = scan.nextLine(); // Variavel temporia
            System.out.print("Email: ");
            String email = scan.next();
            System.out.print("Room: ");
            int roomNumber = scan.nextInt();

            vect[roomNumber] = new Rent(name, email); // Ele instanciou o
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
           if(vect[i] != null){
               System.out.println(i + ":" + vect[i]);
           }
        }
    }
}
/*
 Scanner scan = new Scanner(System.in);

        System.out.printf("How many rooms will be rented? ");
        int numberRoom = scan.nextInt();

        Rent[] rent = new Rent[numberRoom];


            rent[i] = new Rent(name, email);
        }
  Rent r = new Rent("Maria","maria@gmail.com");
        System.out.println(r);

   //Rent rent = new Rent(name,email); // Instanciar em memoria
 */