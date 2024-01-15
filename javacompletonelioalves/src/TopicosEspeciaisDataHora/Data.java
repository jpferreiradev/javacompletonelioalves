package TopicosEspeciaisDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Data {
    public static void main(String[]args){

        // Instanciação (Agora)
        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now(); // Data e hora GNT(HORARIO DE LONDRES)/ Global

        System.out.println(" Data 01 "+ data01);
        System.out.println("Data e hora 02 " + data02);
        System.out.println("Data e hora 03" + data03);

        // Texto ISO 8601

        // Texto formato customizado

        //dia, mes, ano, horario
    }
}
