package courseOld.TopicosEspeciaisDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class exemploTeste {
    public static void main(String[] args) {

        LocalDate dataHoje = LocalDate.now(); // Data de hoje
        LocalDateTime dataHojeHora = LocalDateTime.now(); // Data de hoje e horario
        Instant data = Instant.now();



        System.out.println(dataHoje);
        System.out.println(dataHojeHora);
        System.out.println(data);
    }
}
