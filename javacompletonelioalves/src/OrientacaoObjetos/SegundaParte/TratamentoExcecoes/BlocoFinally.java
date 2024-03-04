package OrientacaoObjetos.SegundaParte.TratamentoExcecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlocoFinally {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt"); // Manipulando arquivos do PC
         Scanner scan = new Scanner(System.in);

        try{
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println( "Error ao abrir o arquivo: " + e.getMessage());
        }
        finally {
            if(scan != null){
                scan.close();
            }
            System.out.println("Executou o bloco finally...");
        }
    }
}
