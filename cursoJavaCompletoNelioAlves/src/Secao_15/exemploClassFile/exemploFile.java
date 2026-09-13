package Secao_15.exemploClassFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exemploFile {
    static void main() {

        File file = new File("c:\\temp\\in.txt"); // Instaciou do tipo File,todo processo de acessar o arquivo
        // Mostrar o conteudo do arquivo
        Scanner scan = null;

        try{
            scan = new Scanner(file);
            while(scan.hasNextLine()){ // testar se ainda existe uma linha no arquivo
                System.out.println(scan.nextLine()); // imprimir a linha
            }
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(scan != null) {
                scan.close();
            }

        }


    }
}
