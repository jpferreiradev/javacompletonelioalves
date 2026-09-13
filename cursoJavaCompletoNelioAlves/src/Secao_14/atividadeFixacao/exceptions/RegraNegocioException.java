package Secao_14.atividadeFixacao.exceptions;

import javax.management.RuntimeErrorException;

public class RegraNegocioException extends RuntimeException {

    public RegraNegocioException(String mensagem) {
        super(mensagem);
    }
}
