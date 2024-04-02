package TrabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExemploBasico {
    public static void main(String[] args) {

        // Exemplo de leitura de arquivo;

        File file = new File("c:\\temp\\in.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if(scan != null){
                scan.close();
            }
        }

    }
}
