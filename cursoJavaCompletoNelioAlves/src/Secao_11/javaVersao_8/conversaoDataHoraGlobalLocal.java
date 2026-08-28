package Secao_11.javaVersao_8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class conversaoDataHoraGlobalLocal {
    static void main() {

        LocalDate d01 = LocalDate.parse("2026-08-19");
        LocalDateTime d02 = LocalDateTime.parse("2026-08-19T01:30:26");
        Instant d03 = Instant.parse("2026-08-19T01:30:26Z"); // Em formato global

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // Pegando o timezone da propriaMaquina
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));


        System.out.println("R1 - Timezone própria máquina: " + r1);
        System.out.println("R2 - Timezone Portugal: " + r2);
        System.out.println("R4 LocalDateTime: PropriaMáquina " + r3);
        System.out.println("R4 LocalDateTime: " + r4);
        System.out.println();

        System.out.println("D01= DIA " + d01.getDayOfMonth());// Pegar o dia de uma data local
        System.out.println("D01= MES " + d01.getMonthValue()); // Pegar o mes
        System.out.println("D01= ANO " + d01.getYear()); // Pegar o ano

        System.out.println("D02 = DIA  " + d02.getDayOfMonth());
        System.out.println("D02 = HORA " + d02.getHour());
        System.out.println("D02 = MIN " + d02.getMinute());


    }
}
