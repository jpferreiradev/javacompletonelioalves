package courseOld.GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.services;


import java.util.ArrayList;
import java.util.List;

public class PrintServiceString {


    private List<String> list = new ArrayList<>(); // Lista de numeros inteiros, usando


    public void addValue(String value) { // Recebe um valor inteiro
        list.add(value); // Adiciona na lista
    }


    public String first() {
        if (list.isEmpty()) { // Se a lista está vazia
            throw new IllegalStateException("Lista está vazia"); // Programação defensiva,
        }
        return list.get(0); // Caso contrario, retorne o primeiro elemento da lista
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for(int i = 1; i < list.size();i++){
            System.out.print(", " + list.get(i)); // Nessa situação o print já faz o casting pra Objet
        }
        System.out.println("]");
    }
}

