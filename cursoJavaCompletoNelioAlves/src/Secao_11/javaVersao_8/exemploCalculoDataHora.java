package Secao_11.javaVersao_8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class exemploCalculoDataHora {
    static void main() {

        LocalDate d01 = LocalDate.parse("2026-08-19");
        LocalDateTime d02 = LocalDateTime.parse("2026-08-19T01:30:26");
        Instant d03 = Instant.parse("2026-08-19T01:30:26Z");

        LocalDate semanaAnteriorLocalDate = d01.minusDays(7); // Diminuindo uma semana
        LocalDate proximaSemanaLocalDate = d01.plusDays(7); // Adicionando uma semana
        LocalDate proximoAnoLocalDate = d01.plusYears(7);

        // Aqui você adicionar outras medidas de horario
        LocalDateTime semanaAnteriorLocalDateTime = d02.minusDays(7); // Diminuindo uma semana
        LocalDateTime proximaSemanaLocalDateTime = d02.plusDays(7); // Adicionando uma semana
        LocalDateTime proximoAnoLocalDateTime = d02.plusYears(7);

        Instant semanaAnteriorInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS); // Adicionando uma semana


        System.out.println("Acrescentar um tempo para DATA HORA");
        System.out.println("LOCAL DATE");
        System.out.println("Semana anterior LocalDate : " + semanaAnteriorLocalDate);
        System.out.println("Próxima semana LocalDate : " + proximaSemanaLocalDate);
        System.out.println("Próximo 7 anos  LocalDate : " + proximoAnoLocalDate);
        System.out.println("LOCAL DATE TIME");
        System.out.println();
        System.out.println("Semana anterior LocalDateTime : " + semanaAnteriorLocalDateTime);
        System.out.println("Próxima semana LocalDateTime : " + proximaSemanaLocalDateTime);
        System.out.println("Próximo 7 anos  LocalDateTime : " + proximoAnoLocalDateTime);
        System.out.println();
        System.out.println("INSTANT");
        System.out.println("Semana anterior semana Instant : " + semanaAnteriorInstant);
        System.out.println("Proxima semana Instant: " + proximaSemanaInstant);

        System.out.println("------------");
        System.out.println("Duração entre data hora");

        //Duration t01 = Duration.between(semanaAnteriorLocalDate, d01); // Vai dar exceção porque LocalDate não tem informação de tempo
        //Duration t01 = Duration.between(semanaAnteriorLocalDate.atTime(0, 0), d01.atTime(0, 0)); // É preciso converter para LocalDateTime
        Duration t01 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(), d01.atStartOfDay()); // sem armengue
        Duration t02 = Duration.between(semanaAnteriorLocalDateTime, d02);
        Duration t03 = Duration.between(semanaAnteriorInstant,d03);
        Duration t04 = Duration.between(d03,proximaSemanaInstant);

        System.out.println("D01 - Duração em dias:" + t01.toDays());
        System.out.println("D02 - Duração em dias:" + t02.toDays());
        System.out.println("D03 - Duranção em dias:" + t03.toDays());
        System.out.println("D04 - Duranção em dias: " + t03.toDays());

    }
}
