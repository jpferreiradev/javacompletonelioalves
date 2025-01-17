package courseOld.GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.services;


import java.util.ArrayList;
import java.util.List;

public class PrintService {


    private List<Integer> list = new ArrayList<>(); // Lista de numeros inteiros, usando

    // Primeiro método criado, add um valor
    public void addValue(Integer value) { // Recebe um valor inteiro
        list.add(value); // Adiciona na lista
    }

    // Segundo método criado, devolve o primeiro elemento
    public Integer first() {
        if (list.isEmpty()) { // Se a lista está vazia
            throw new IllegalStateException("Lista está vazia"); // Programação defensiva,
        }
        return list.get(0); // Caso contrario, retorne o primeiro elemento da lista
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) { // Se a lista não for vazia
            System.out.print(list.get(0));
        }
        for(int i = 1; i < list.size();i++){ // Segundo elemento em diante
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}

