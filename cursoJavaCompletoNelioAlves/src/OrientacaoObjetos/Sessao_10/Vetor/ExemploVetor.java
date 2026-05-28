package OrientacaoObjetos.Sessao_10.Vetor;

public class ExemploVetor {
    static void main() {

        double[] alturas = new double[3];

        alturas[0] = 1.72;
        alturas[1] = 1.56;
        alturas[2] = 1.90;

        System.out.println("Exemplo forEach: ");

        for (double n : alturas) {
            System.out.printf(" " + n);

        }
        System.out.println("\n\nExemplo for normal");
        for(int i= 0; i < alturas.length; i++){
            System.out.printf(" " + alturas[i]);
        }
    }
}
