package Secao_13.exemploClassAbstrata.entities;

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

    public void emprestimo(double saldo) {
        if (saldo <= limiteEmprestimo) {
            saldoDaConta += saldo - 10.0;
        }


    }

    @Override
    public void saque(double saldo) {
        super.saque(saldo);
        saldoDaConta -= 2.0;
    }
}
