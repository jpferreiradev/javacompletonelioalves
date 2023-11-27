package OrientacaoObjetos.MembrosEstaticos.Atividade;

public class CurrencyConverter {


    public static double IOF = 0.06; // SEMPRE LEMBRAR QUE ISSO É UMA CONSTANTE NO JAVA
    public static double conversaoDolar(double valor, double precoDolar){
        return valor * precoDolar * (1.0 + IOF);
    }

}
