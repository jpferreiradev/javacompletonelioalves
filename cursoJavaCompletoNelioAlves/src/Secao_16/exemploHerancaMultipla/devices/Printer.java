package Secao_16.exemploHerancaMultipla.devices;

public class Printer extends Device {

    public Printer(String serialNumber) {
        super(serialNumber);

    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processang" + doc);
    }
    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
