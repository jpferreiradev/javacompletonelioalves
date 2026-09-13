package Secao_15.Exercicio;

import java.io.File;
import java.util.Scanner;

public class Atividade {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String caminho = scan.nextLine();


        File file = new File(caminho);

        System.out.println("O caminho foi: " + file.getPath());
        File meuArquivo = new File("summaryu.csv");


    }
}


/*

 Criar um arquivo csv
Informar aonde o arquivo vai ser criado
 Criar a pasta original e com
 Criar uma subpasta chamada "out"
 */