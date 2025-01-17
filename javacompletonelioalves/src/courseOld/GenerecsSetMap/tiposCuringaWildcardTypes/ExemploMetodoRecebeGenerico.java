package courseOld.GenerecsSetMap.tiposCuringaWildcardTypes;

import java.util.ArrayList;
import java.util.List;

public class ExemploMetodoRecebeGenerico {
    public static void main(String[] args) {

        List<Object> myObj = new ArrayList<Object>();
        List<Integer> myNumbrs = new ArrayList<Integer>();
        //myObj = myNumbrs; // ele não pode converter um list Integer para um list Object



        System.out.println("Diferente:");

        Object obj;
        Integer x = 10;
        obj = x;
        System.out.println(obj);

        System.out.println("O supertipo de lista é List<?>");
        List<?> myOJj = new ArrayList<Object>(); // Esse aqui é o tipo curinga
        List<Integer> mynumbrs = new ArrayList<Integer>();
        myOJj = mynumbrs;


    }
}
