package Secao_13.exemploHeranca.entities;

public class ContaEmpresarial extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();

    }

    public ContaEmpresarial(Integer numero, String titular, Double saldoDaConta, Double limiteEmprestimo) {
        super(numero, titular, saldoDaConta);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double saldo){
        if(saldo <= limiteEmprestimo){
            saldoDaConta += saldo - 10.0;
        }


    }
}
