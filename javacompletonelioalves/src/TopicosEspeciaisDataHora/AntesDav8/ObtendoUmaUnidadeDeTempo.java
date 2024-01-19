package TopicosEspeciaisDataHora.AntesDav8;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ObtendoUmaUnidadeDeTempo {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2024-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minuto = cal.get(Calendar.MINUTE);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);



        System.out.println("Minuto = " + minuto);
        System.out.println("Mês = " + mes);
        System.out.println("Ano = " + ano);


        /*
         Era pra imprimir isso:
          Minutos: 42
          Mês: 6
        */
    }
}
