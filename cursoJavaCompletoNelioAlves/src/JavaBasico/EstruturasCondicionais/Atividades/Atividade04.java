package JavaBasico.EstruturasCondicionais.Atividades;

import java.util.Scanner;

public class Atividade04 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int valorDiaEmMinutos,horarioEntrada,horarioSaida,valorDiaInteiro,valorHoraDia;
        int conversaoHoraMinutoEntrada,conversaoHoraMinutoSaida,conversaoHoraMin,duracaoHoras;

        valorDiaEmMinutos = 60 * 24;
        valorDiaInteiro = 24;
        valorHoraDia = 60;


        horarioEntrada = scan.nextInt();
        horarioSaida= scan.nextInt();

        if(horarioSaida < horarioEntrada){
            conversaoHoraMinutoEntrada = horarioEntrada * 60;
            conversaoHoraMinutoSaida = horarioSaida * 60;
            conversaoHoraMin =  valorDiaEmMinutos - conversaoHoraMinutoEntrada + conversaoHoraMinutoSaida;
            duracaoHoras = conversaoHoraMin / valorHoraDia;
            //System.out.println(conversaoHoraMinutoEntrada);
            //System.out.println(conversaoHoraMinutoSaida);
            //System.out.println(valorDiaEmMinutos);
            //System.out.println(conversaoHoraMin);
            System.out.println("DURAÇÃO:" + duracaoHoras);
        } else if (horarioSaida > horarioEntrada) {
            conversaoHoraMinutoEntrada = horarioEntrada * 60;
            conversaoHoraMinutoSaida = horarioSaida * 60;
            conversaoHoraMin = conversaoHoraMinutoSaida - conversaoHoraMinutoEntrada;
            duracaoHoras = conversaoHoraMin /valorHoraDia;
            System.out.println("DURAÇÃO:" + duracaoHoras);
        } else if(horarioEntrada == 0 && horarioSaida == 0){
            System.out.println("DUROU 24HRS");
        }





        /*
        if(horarioSaida < horarioEntrada){

        }
        */


    }
}
