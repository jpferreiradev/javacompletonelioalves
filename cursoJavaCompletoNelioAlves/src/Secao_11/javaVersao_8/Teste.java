package Secao_11.javaVersao_8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste {
    static void main() {

        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formatação da data
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // formataçao da data

        LocalDate local = LocalDate.now();
        LocalDateTime local2 = LocalDateTime.now();

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();


        System.out.println("Data normal LocalDate: " + local);
        System.out.println("Data editada LocalDate: " + fmt01.format(local));
        System.out.println("Data normal: LocalDate " + local2);
        System.out.println("Data editada:LocalDateTime " + fmt02.format(local2)); // Essa aqui eu quero;

        System.out.println();
        System.out.println("Informe a data do seu aniverário: ");
        String data = scan.nextLine();
        LocalDate dataEditada = LocalDate.parse(data, fmt01);
        System.out.println("Seu aniversário é: " + dataEditada.format(fmt01));


    }
}
