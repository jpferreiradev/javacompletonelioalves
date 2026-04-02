package OrientacaoObjetos.membrosEstaticos.atividade.util;

public class CurrencyConverter {

    public static final double IOF = 6.0;

    public static double conversaoDolarReal(double dolarNow,double quantidadeDolar){
        double conversaoIOF = IOF / 100;
        double conversaoDolarReal = quantidadeDolar * dolarNow;
        double n = conversaoDolarReal * conversaoIOF;
        return n + conversaoDolarReal;
    }

}
/*
public static double IOF = 0.06;
public static double dollarToReal(double amount, double dollarPrice) {
return amount * dollarPrice * (1.0 + IOF);

 Na correção, ele colocou valores diretamente;

 */