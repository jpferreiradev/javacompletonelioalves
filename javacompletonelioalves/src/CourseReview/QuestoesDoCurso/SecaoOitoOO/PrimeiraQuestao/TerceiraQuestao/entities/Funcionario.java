package CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.TerceiraQuestao.entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double taxaImposto;

    public double salarioLiquido() {
        return salarioBruto - taxaImposto;
    }

    public void aumentarSalario(double porcentagem) {
        double aumento = salarioBruto * (porcentagem  / 100);
        double novoSalario = salarioLiquido() + aumento;
        System.out.println("Dados atualizados: " + nome + ", R$" + novoSalario );
    }

    @Override
    public String toString() {
        return String.format("Funcionario : " + nome + ", R$: " + salarioLiquido());
    }
}
