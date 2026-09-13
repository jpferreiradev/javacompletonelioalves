package Secao_16.exemploInterfaceComparable.entities;

public class Funcionario implements Comparable<Funcionario>{

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
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


    // Fazer a comparação de um funcionario por nome
    @Override
    public int compareTo(Funcionario o) {
        //return nome.compareTo(o.getNome()); // comparando um funcionario com outro pelo nome;
        return salario.compareTo(o.getSalario()); // comparando por salario
        //return -salario.compareTo(o.getSalario()); // comparando por salario em ordem decrescente
    }

}
/*
 Quando você fala que uma classe é Compareble ( Comparavel), significa que você vai ter que implementar esse contrato
 dizendo como você compara o seu objeto com algum outro objeto que você informar aqui:
 compareTo(Funcionario o)
 */