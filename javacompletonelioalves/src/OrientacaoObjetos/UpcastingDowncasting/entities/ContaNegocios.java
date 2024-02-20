package OrientacaoObjetos.UpcastingDowncasting.entities;

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
            //deposito(quantidade);
            saldo += quantidade - 10.0;
        }

    }
}
