package OrientacaoObjetos.Sessao_10.Listas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ExemploArraylist_2 {
    static void main() {

       // List x = new List();

        // List<String> list = new ArrayList<String>(); -> Outras versões do Java pode pedir o tipo no final
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco"); // -> Adicionando um elemento fora da lista

        System.out.printf("TAMANHO DA LISTA: " + list.size());
        System.out.println();
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("------------------------------ REMOÇÃO DO ELEMENTO( LETRA)  M ---------");
        // REMOÇÃO DA LISTA
        //list.remove("Ricarte");
        //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M'); // -> REMOÇÃO POR PREDICADO, ele mostra a funação LAMBDA
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------------------"); // ENCONTRAR A POSIÇÃO DE UM ELEMENTO
        System.out.println("Index of bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("--------------------------- FILTRANDO A LISTA COM A LETRA A"); // -> Deixar na lista somente quem tem o nome M, filtrando a lista
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // Converter pra Stream, faz a operação lambda que precisa, depois é voltar ele pra lista
        for(String x : resultado){
            System.out.println(x);
        }

        System.out.println("--------------------------- ECONTRAR O PRIMEIRO ELEMENTO QUE COMECE COM A LETRA 'A' ");
        System.out.println("--------------------------- ENCONTRAR UM ELEMENTO DA LISTA QUE ATENDA CERTO PREDICADO ");
        String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);

    }
}
