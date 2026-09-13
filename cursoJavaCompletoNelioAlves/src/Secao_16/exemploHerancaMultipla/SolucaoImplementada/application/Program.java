package Secao_16.exemploHerancaMultipla.SolucaoImplementada.application;

import Secao_16.exemploHerancaMultipla.SolucaoImplementada.devices.ComboDevice;
import Secao_16.exemploHerancaMultipla.SolucaoImplementada.devices.ConcretePrinter;
import Secao_16.exemploHerancaMultipla.SolucaoImplementada.devices.ConcreteScanner;

public class Program {
    static void main() {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result:" + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertion");
        c.print("My dissertion");
        System.out.println("Scan result: " + c.scan());

    }
}
