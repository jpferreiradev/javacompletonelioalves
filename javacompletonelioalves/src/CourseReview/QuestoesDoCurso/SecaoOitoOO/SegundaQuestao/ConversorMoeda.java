package CourseReview.QuestoesDoCurso.SecaoOitoOO.SegundaQuestao;

public class ConversorMoeda {


    public static double IOF = 0.06;

    public static double conversorMoeda(double valorDolar, double valorCompra) {
        return valorDolar * valorCompra * (1.0 + IOF);
    }
}
