package GenerecsSetMap.CuringasDelimitadosBoundedWildcards.Exemplo1.entities;

public class Circulo implements Shape {

    private Double raios;

    public Circulo(){

    }

    public Circulo(Double raios) {
        super();
        this.raios = raios;
    }

    public Double getRaios() {
        return raios;
    }

    public void setRaios(Double raios) {
        this.raios = raios;
    }

    @Override
    public double area() {
        return Math.PI * raios * raios;
    }
}
