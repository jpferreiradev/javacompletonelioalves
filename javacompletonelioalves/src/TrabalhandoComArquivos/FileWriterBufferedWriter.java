package TrabalhandoComArquivos;

import java.io.*;

public class FileWriterBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[] {"Bom dia","Boa tarde","Boa noite"};

        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for( String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
