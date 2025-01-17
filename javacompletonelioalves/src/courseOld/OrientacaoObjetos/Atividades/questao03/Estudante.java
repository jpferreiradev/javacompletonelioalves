package courseOld.OrientacaoObjetos.Atividades.questao03;

import java.util.Scanner;

public class Estudante {

    Scanner scan = new Scanner(System.in);
    public String nome;
    public double nota;


    public void media(){
        System.out.println("Informe o seu nome e 3 notas: ");
        nome = scan.nextLine();
        double primeiraNota = scan.nextDouble();
        double segundaNota = scan.nextDouble();
        double terceiraNota = scan.nextDouble();



        if(primeiraNota > 30 ){
            System.out.println("Digite novamente, a priemira nota não pode ser maior que 30");
        } else if(segundaNota > 35) {
            System.out.println("Digite novamente, a segunda nota não pode ser maior que 35");
        } else if (terceiraNota > 35) {
            System.out.println("Digite novamente, a terceira nota não pode ser maior que 35");
        }
        double mediaFinal = (primeiraNota + segundaNota + terceiraNota);
        //System.out.println("FINAL GRADE = " + mediaFinal);

        if(mediaFinal > 60){
            System.out.println("FINAL GRADE = " + mediaFinal);
            System.out.println("PASS");
        } else{
            double faltaMedia = 60 - mediaFinal;
            System.out.println("FINAL GRADE = " + mediaFinal);
            System.out.println("FAILED");
            System.out.println("MISSING " + faltaMedia + "POINTS");
        }

    }


    public void resultadoAprovacao(){
    }

}
