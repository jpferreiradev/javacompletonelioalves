package courseOld.GenerecsSetMap.CuringasDelimitadosBoundedWildcards.Exemplo1.application;

import courseOld.GenerecsSetMap.CuringasDelimitadosBoundedWildcards.Exemplo1.entities.Circulo;
import courseOld.GenerecsSetMap.CuringasDelimitadosBoundedWildcards.Exemplo1.entities.Retangulo;
import courseOld.GenerecsSetMap.CuringasDelimitadosBoundedWildcards.Exemplo1.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        List<Shape> myShapes = new ArrayList<>(); // Porque ele criou uma lista direto da Interface?
        myShapes.add(new Retangulo(3.0,2.0));
        myShapes.add(new Circulo(2.0));


        // Adicionando outra lista
        List<Circulo> myCircles = new ArrayList<>();
        myCircles.add(new Circulo(2.0));
        myCircles.add(new Circulo(3.0));


        //System.out.println("Soma total das areas: " + totalArea(myShapes));
        System.out.println("Soma total das areas: " + totalArea(myCircles)); // Aqui vai dar um erro de casting
    }

    public static double totalArea(List< ?extends  Shape> list){ //Método abstrato
        double soma = 0.0;
        for(Shape s : list){
            soma += s.area(); // Pecorendo a lista e aculando as areas de cada figura e retorna a soma de todas
        }
        return soma;
    }
}
