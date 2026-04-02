package TopicosEspeciaisEmJavaDataHora.versao8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExemploLocalDate {
    static void main() {

        LocalDate data = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        System.out.println("LocalDate: " + data);
        System.out.println("LocalDateTime: " + data2);
    }
}
