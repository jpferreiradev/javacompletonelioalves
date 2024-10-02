package GenerecsSetMap.IntroducaoGenerics.SolucaoComGenerecs.services;


import java.util.ArrayList;
import java.util.List;

public class PrintServiceGenerics<T> {


    private List<T> list = new ArrayList<>();


    public void addValue(T value) {
        list.add(value);
    }


    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista está vazia");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for(int i = 1; i < list.size();i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
