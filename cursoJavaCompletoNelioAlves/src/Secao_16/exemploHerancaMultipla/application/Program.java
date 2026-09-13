package Secao_16.exemploHerancaMultipla.application;

import Secao_16.exemploHerancaMultipla.devices.Printer;
import Secao_16.exemploHerancaMultipla.devices.Scanner;

public class Program {
    static void main() {

        Printer p = new Printer("1080");
        p.processDoc("My letter");
        p.print("My Letter");

        Scanner s = new Scanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result:" + s.scan());


    }
}
