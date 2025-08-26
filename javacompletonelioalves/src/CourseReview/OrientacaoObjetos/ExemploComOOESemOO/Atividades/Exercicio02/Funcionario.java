package CourseReview.OrientacaoObjetos.ExemploComOOESemOO.Atividades.Exercicio02;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public Funcionario() {

    }

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }


    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    /* Como eu fiz;
    public void aumentoSalario(double porcentagem) {
       double conversaoPorcetagem,valorAumentoSalario,novoSalario;

        conversaoPorcetagem = porcentagem / 100;
        valorAumentoSalario = conversaoPorcetagem * salarioBruto;
        novoSalario = valorAumentoSalario +  salarioLiquido();
        System.out.println(novoSalario);
    }
    */
    public void aumentoSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }


}

/*
String. format ("%.2f",variavel);
 */