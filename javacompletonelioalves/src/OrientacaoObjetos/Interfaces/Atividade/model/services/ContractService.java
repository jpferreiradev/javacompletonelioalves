package OrientacaoObjetos.Interfaces.Atividade.model.services;

public class ContractService implements OnlinePaymentService{

    @Override
    public double paymentFee(double amount) {
        return 0;
    }

    @Override
    public double interest(double amount, int months) {
        return 0;
    }
}
