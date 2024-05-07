package OrientacaoObjetos.Interfaces.InterfaceComparable.entities;

public class Funcionario implements Comparable<Funcionario> {

    private String nome;
    private Double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    // Utilizando um novo metodo Comparable
    @Override
    public int compareTo(Funcionario outro) {
        //return nome.compareTo(outro.getNome()); -> // Aqui está comparando por nome
        return salario.compareTo(outro.getSalario()); // -> Aqui está comparando por salario
        //return -salario.compareTo(outro.getSalario()); -> Ordem decressente
    }
}
