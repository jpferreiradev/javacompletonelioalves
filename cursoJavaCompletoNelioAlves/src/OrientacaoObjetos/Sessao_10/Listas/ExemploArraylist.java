package OrientacaoObjetos.Sessao_10.Listas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploArraylist {
    static void main() {

        // Aqui List é uma interface
        List<String> lista = new ArrayList<>(); // Exemplo de Arraylist

        // ADICIONANDO ELEMENTOS NA LISTA
        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add(2, "Marco"); //Adicionar elemento fora da lista;

        // -> REMOVER ELEMENTOS NA LISTA
        //lista.remove("Anna");
        //lista.remove(1);
        // TAMANHO DA LISTA
        System.out.println();
        System.out.println("TAMANHO DA LISTA: " + lista.size());

        for(String x: lista){
            //System.out.printf(" " + x);
            System.out.println(x);
        }

        System.out.println("-------------------\n");
        //lista.remove(1);
        lista.removeIf(x -> x.charAt(0) == 'M'); //Aqui exemplo de PREDICADO, uma FUNÇÃO LAMBDA;

        for(String x: lista){
            //System.out.printf(" " + x);
            System.out.println(x);
        }

        System.out.println("-------------------\n");

        // ENCONTRAR A POSIÇÃO DE UM ELEMENTO
        System.out.println("INDEX OF BOB: " + lista.indexOf("Bob"));
        System.out.println("INDEX OF MARCO: " + lista.indexOf("Marco"));


        System.out.println("-------------------\n");
        // FILTRANDO A LISTA TODO MUNDO QUE COMEÇA COM A

        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x: resultado){
            //System.out.printf(" " + x);
            System.out.println(x);
        }

        System.out.println("-------------------\n");
        //String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //Encontrar elemento com J, vai dar NULL;
        System.out.println(nome);

    }
}
