package Secao_10.exemploList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exemplo01 {
    static void main() {

        List<String> list = new ArrayList<>();
        //List<Integer> list = new ArrayList<String>(); -> Pode ser assim, mas nas versões mais atuais do Java, a de cima server;

        // -> Adicionando elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println("Tamanho da lista:  " + list.size() + "\n"); // Coloque o \n no final do pular uma linha ele retorna -1


        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------\n");
        //list.remove(1); // Remover elementos da lista

        list.removeIf(x -> x.charAt(0) == 'M'); // Remoção da lista a partir do predicado, remover todo elemento com a letra M
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------\n");
        // Encontrar a posição de um elemento
        System.out.println("Index of Bob:( Posição do elemento)  " + list.indexOf("Bob"));
        System.out.println("Index of Bob:( Quando não encontra o elemento na posição )  " + list.indexOf("Marco")); // Quando não encontrar o elemento;

        System.out.println("--------------------\n");
        // Filtrar na lista de modo que somente aqueles que tem o nome começado com M fiquem na lista
        // Você precisa criar uma nova lista;
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("Elementos apenas começado com A: ");
        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println("--------------------\n");
        // Encontrar um elemento na lista que atenda um certo predicado, exemplo com a letra A;
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        // findFirst pega o primeiro elemento que atenda ao predicado A, se o elemento não existir ele vai retornar nulo;
        System.out.println(nome);





    }
}
