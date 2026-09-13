package Secao_15.exemploEscritaArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class exemploFileWriterEBufferWriter {
    static void main() {

        String[] linhas = new String[]{"Bom dia", "Boa tarde", "Boa noite"};

        // Criar um arquivo e gravar dados no arquivo, ou seja, escrita

        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            //try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) -> Não quer recriar o arquivo, ele vai acresentar novamenete os dados no arquivo
            // fazer a gravação do vetor
            for(String linha : linhas){
                bw.write(linha);
                bw.newLine();// Quebra de linha
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
