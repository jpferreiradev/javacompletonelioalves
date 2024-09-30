package GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    private List<Integer> list = new ArrayList<>(); // Lista de numeros inteiros - Já usando Generics

    public void addValue(Integer valor) {
        list.add(valor); // Recebe um valor inteiro e add na lista
    }

    public Integer frist() {
        if (list.isEmpty()) { // Se a lista está vazia
            throw new IllegalStateException("Lista está vazia"); // Programação defensiva, tratando a exceção
        }
        return list.get(0); // retornar o primeiro elemento da lista
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) { // Se a lista não for vazia e  tiver pelo menos um elemento
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print("," + list.get(i));
        }
        System.out.println("]");
    }

}