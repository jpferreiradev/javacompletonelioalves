package OrientacaoObjetos.Atividades.questao02;

public class Funcionario {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage){
        return (percentage / 100) * grossSalary + netSalary();
    }

}
