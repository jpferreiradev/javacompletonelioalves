package TopicosEspeciaisDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcularDataHora {
    public static void main(String[] args) {

        LocalDate data01 = LocalDate.parse("2024-01-17"); // Só a Data "normal"
        LocalDateTime data02 = LocalDateTime.parse("2024-07-17T01:30:26"); //Data local "normal" com hora;
        Instant data03 = Instant.parse("2024-01-17T01:30:26Z"); //Data  global com o timezone de Londres

        LocalDate semamaAnteriorLocalDate = data01.minusDays(7); // Instanciando uma nova data, que seria menos 7 dias
        LocalDate proximaSemanaLocalDate = data01.plusDays(7);

        System.out.println("Semana anterior = " + semamaAnteriorLocalDate);
        System.out.println("Proxima semana = " + proximaSemanaLocalDate);

        System.out.println("----------------");

        LocalDateTime semanaAnteriorLocalDateTime = data02.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = data02.plusDays(7);

        System.out.println("Semana anterior = " + semanaAnteriorLocalDateTime);
        System.out.println("Proxima semana = " + proximaSemanaLocalDateTime);

        System.out.println("----------------");

        Instant semanaAnteriorInstant = data03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = data03.plus(7,ChronoUnit.DAYS);

        System.out.println("Semana anterior = " + semanaAnteriorInstant);
        System.out.println("Proxima semana = " + proximaSemanaInstant);

        System.out.println("------ Calcular a duração entre duas datas horas --------");

        // Conversão de LocalDate para LocaDateTime, porque o LocalDate não tem informação do tempo;
        //Duration t1 = Duration.between(semamaAnteriorLocalDate.atTime(0, 0),data01.atTime(0 ,0)); // LocalDate não tem informação de tempo
        Duration t1 = Duration.between(semamaAnteriorLocalDate.atStartOfDay(),data01.atStartOfDay()); // Conversão direta para o LocalDateTime ( Nome do metodo: No inicio do dia)
        Duration t2 = Duration.between(semanaAnteriorLocalDateTime,data02);
        Duration t3 = Duration.between(semanaAnteriorInstant,data03);
        Duration t4 = Duration.between(data03,semanaAnteriorInstant); // Exemplo de uma data maior e menor


        System.out.println("T1 dias = " + t1.toDays());
        System.out.println("T2 dias = " + t2.toDays());
        System.out.println("T3 dias = " + t3.toDays());
        System.out.println("T4 dias = " + t4.toDays());
    }

}
