package TrabalhandoComArquivoss.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Forma básica para leitura de um arquivo no Java utilizando o Scanner

        File file = new File("d:\\in.txt");

        Scanner scan = null; // Instanciar um Scanner a partir de um arquivo

        try {
            scan = new Scanner(file); // Instaciar o scanner a partir desse arquivo;

            while (scan.hasNextLine()) { // Aqui é para testar se tem uma nova linha no arquivo
                System.out.println(scan.nextLine()); // Aqui ele vai ler essa linha do arquivo e imprimir
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        // Boa prática, colocar o fechamento do seu recurso no bloco finally, porque o recuso vai ser fechado independente se deu certo ou não.
        finally {

            if (scan != null) {
                scan.close();
            }
        }


    }
}
