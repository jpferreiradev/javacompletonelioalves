package OrientacaoObjetos.Sessao_10.Listas.Atividades.Atividades_1.entities;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(){

    }

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void aumentarSalario(double porcetagem){
        /*
        double porcetagemSalario = porcetagem / 100;
        double valorAumentoSalario = salario * porcetagemSalario;
        double novoSalario = valorAumentoSalario + salario;
        System.out.println(novoSalario);
         salario = salary + salary * porceragem / 100.0);
         */
        salario += salario * porcetagem / 100.0;

    }
@Override //É uma boa pratica sempre colocar, ele ajuda a você não errar o nome do metodo
    public String toString(){
        return id + " , " + nome + ", " + String.format("%.2f", salario);
    }
}
