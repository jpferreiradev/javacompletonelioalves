package OrientacaoObjetos.Interfaces.ProblemaDoDiamente.application;


import OrientacaoObjetos.Interfaces.ProblemaDoDiamente.devices.ComboDevice;
import OrientacaoObjetos.Interfaces.ProblemaDoDiamente.devices.ConcretePrinter;
import OrientacaoObjetos.Interfaces.ProblemaDoDiamente.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("Comportamento da impressora");
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        System.out.println();
        System.out.println("Comportamento do Scanner");
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        System.out.println("Comportamento do ComboDevice");
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}