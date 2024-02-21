package OrientacaoObjetos.SegundaParte.SobreposicaoMetodos.entities;

public class ContaNegocios extends Conta {


    private Double limiteEmprestimo;

    public ContaNegocios(){
        super(); //Caso alguma logica seja implementada no futuro, a contaNegocios também irá pegar
    }

    public ContaNegocios(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo); // Chamando o construtor da superClass
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double quantidade){
        if(quantidade <= limiteEmprestimo){
            saldo += quantidade - 10.0;
        }

    }

    @Override
    public void saque(double quantidade) {
        super.saque(quantidade);
        saldo -= 2.0;
    }
}
