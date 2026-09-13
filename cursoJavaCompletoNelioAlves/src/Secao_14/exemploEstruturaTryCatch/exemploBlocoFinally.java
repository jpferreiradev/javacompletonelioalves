package Secao_14.exemploEstruturaTryCatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exemploBlocoFinally {
    static void main() {

        // Exemplo para mostrar um arquivo texto e mostrar o conteudo desse texto na tela

        File file = new File("C:\\temp\\in.txt"); // Caminho do arquivo
        Scanner scan = null;

        try{
            scan = new Scanner(file); // Tentar instanciar o scanner a partir do arquivo
            while(scan.hasNextLine()){ // Se o arquivo existe, ele vai abrir na tela
                System.out.println(scan.nextLine()); // Codigo basico para pecorrer as linhas do arquivo
            }
        } catch (IOException e){ // Caso não consiga encontrar o arquivo ou não exista;
            System.out.println("Error ao abrir o arquivo: " + e.getMessage());
        }
        finally{
            if(scan != null){ // Fechar o Scanner para evitar que o arquivo fique aberto, aqui fecha o scanner e fecha o arquivo
                scan.close();
            }
            System.out.println("Bloco finally executou!");
        }
    }
}

/*

 Primeira parte sem o arquivo existir
   File file = new File("C:\\temp\\in.txt"); // Caminho do arquivo
        Scanner scan = null;

        try{
            scan = new Scanner(file); // Tentar instanciar o scanner a partir do arquivo
            while(scan.hasNextLine()){ // Se o arquivo existe, ele vai abrir na tela
                System.out.println(scan.nextLine()); // Codigo basico para pecorrer as linhas do arquivo
            }
        } catch (IOException e){ // Caso não consiga encontrar o arquivo ou não exista;
            System.out.println("Error ao abrir o arquivo: " + e.getMessage());
        }
        finally{
            if(scan != null){ // Fechar o Scanner para evitar que o arquivo fique aberto, aqui fecha o scanner e fecha o arquivo
                scan.close();
            }
            System.out.println("Bloco finally executou!");
        }
    }
 */

