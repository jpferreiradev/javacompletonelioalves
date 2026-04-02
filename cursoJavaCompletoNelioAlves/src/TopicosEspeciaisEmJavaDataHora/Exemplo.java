package TopicosEspeciaisEmJavaDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exemplo {
    static void main() {

        // Documentação do DateTimeFormatter - https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Classe para customizar a data no Java
        DateTimeFormatter formato02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm)");

        // Agora -  Por padrão ele gera o texto no formato ISO 8601
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); // Data e hora global, horario de Londres


        // Texto ISO 8601
        LocalDate d04 = LocalDate.parse("2026-02-26"); //Precisa colocar o formato da data ISO
        LocalDateTime d05 = LocalDateTime.parse("2026-02-26T01:30:26"); // Precisa colocar no formato ISO, com hora
        Instant d06 = Instant.parse("2026-02-26T01:30:26Z");
        Instant d07 = Instant.parse("2026-02-26T01:30:26-03:00"); // Aqui é um time diferente do GMT


        // TEXTO FORMATO CUSTOMIZADO
        LocalDate d08 = LocalDate.parse("26/02/2026", formato01);
        // LocalDate d08 = LocalDate.parse(DateTimeFormatter.ofPattern("dd/MM/yyyy"); -> Poderia ter colocado assim!
        LocalDateTime d09 = LocalDateTime.parse("26/02/2026 01:30)",formato02);

        // Dados isolados ( dia / mes /ano)
        LocalDate d10 = LocalDate.of(2026,2,26);
        LocalDateTime d11 = LocalDateTime.of(2026,02,26,22,18);



        System.out.println("d01 = " + d01);
        System.out.println(" Com horario - > d02 =  " + d02);
        System.out.println("d03 =  " + d03); //Tem o Z no final
        System.out.println("d04 =  " + d04);
        System.out.println("d05 =  " + d05);
        System.out.println("d06 =  " + d06);
        System.out.println("d07 =  " + d07);
        System.out.println("d08 =  " + d08);
        System.out.println("d09 =  " + d09);
        System.out.println("d10 =  " + d10);
        System.out.println("d11 =  " + d11);
    }
}
