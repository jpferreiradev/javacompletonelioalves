package OrientacaoObjetos.Atividades.Exercicio02.entities;

public class Funcionario {

    public String nome;
    public Double salarioBruto;
    public Double taxa;

    public Funcionario(){

    }

    public Funcionario(String nome, Double salarioBruto, Double taxa){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;

    }

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public void aumentoSalario(double porcentagem){
        double conversao =
        salarioBruto += salarioBruto * (porcentagem / 100);
        //double novoSalario = conversao + salarioLiquido();
        //System.out.println(novoSalario);
    }

    @Override
    public String toString() {
        return String.format(nome + " , R$" + "%.2f",salarioLiquido());
    }
}
