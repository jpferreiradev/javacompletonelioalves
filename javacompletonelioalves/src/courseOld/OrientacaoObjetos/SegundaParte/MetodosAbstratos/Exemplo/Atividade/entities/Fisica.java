package courseOld.OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.Atividade.entities;

public class Fisica extends Contribuinte {

    private Double depesaSaude;

    public Fisica() {
        super();
    }

    public Fisica(String nome, double rendaAnual, Double depesaSaude) {
        super(nome, rendaAnual);
        this.depesaSaude = depesaSaude;
    }

    public Double getDepesaSaude() {
        return depesaSaude;
    }

    public void setDepesaSaude(Double depesaSaude) {
        this.depesaSaude = depesaSaude;
    }


    @Override
    public double taxa() {
        if (getRendaAnual() > 20000.00 && getDepesaSaude() > 0) {
            return (getRendaAnual() * 2.5) - (getDepesaSaude() * 5);
        } else {
            return getRendaAnual() * 1.5;
        }
    }

}




