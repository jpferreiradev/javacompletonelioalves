package OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.SolucaoBoa.model.exceptions;

public class DomainException extends RuntimeException {

    public DomainException(String msg){
        super(msg);
    }

}

// Foi trocada a extends de Exception para RuntimeExcepetion
// RunTimeExcepetion, você não é obrigado a tratar a exceção