package EnumaracaoEComposicao.ExemploUm.entitites;

import EnumaracaoEComposicao.ExemploUm.entitites.enums.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String name;
    private NivelTrabalhador nivel; // Aqui estamos usuando um atributo como ENUM;
    private Double baseSalarial;


    // Composição de OBJETOS, feitos com a
    private Departamento departamento; // Associação tem UM
    private List<HoraContrato> contratos = new ArrayList<>(); // Assoiação tem MUITOS, foi representado por uma lista;


    public Trabalhador() {

    }

    public Trabalhador(String name, NivelTrabalhador nivel, Double baseSalarial, Departamento departamento) {
        this.name = name;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }


    // Dois metodos responsaveis por fazer ou desfazer a composição entre um trabalhador e um contrato

    public void adicionarContrato(HoraContrato contrato) {
        contratos.add(contrato); // Essa é a lá de cima
    }

    public void removerContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }


    // Preste atenção nesse metodo, ele é importante -> Tente fazer o LocalDateTime
    public double rendaAnual(int ano, int mes) { // Lembre que esse ano e mes é o ano que foi informado;
        double soma = baseSalarial;
        Calendar cal = Calendar.getInstance(); // Usou a classe Calender
        for (HoraContrato c : contratos) {
            cal.setTime(c.getData()); // Aqui foi pego a data do meu contrato C e definir essa data como sendo a data do Calendario
            int c_ano = cal.get(Calendar.YEAR);  // Feito para calcular o ano do contrato c;
            int c_mes = 1 + cal.get(Calendar.MONTH);// feito para calcular o mes do contrato c; // Foi adicionada +1, por que o mes no Calender começa com 0;
            if (ano == c_ano && mes == c_mes) {
                soma += c.totalHora();
            }

        }
        return soma;
    }
}


/*
    // set removido por causa do acesso de inserir e remover contratos, já que esse ArrayList seria uma outra lista
    public void setContratos(List<HoraContrato> contratos) {
        this.contratos = contratos;
    }

 // Essa é a lista lá de cima, a lista que foi removida no setArrayList seria outra lista



    // Aqui seria a soma se fosse todos os contratos
     public double rendaAnual(int ano, int mes){
        double soma = baseSalarial;
        for(HoraContrato c : contratos){
            soma += c.totalHora();
        }
        return soma;
    }

    // Aqui seria a soma se fosse comparando a data e o mes do ano
  public double rendaAnual(int ano, int mes){
        double soma = baseSalarial;
        Calendar cal = Calendar.getInstance();
        for(HoraContrato c : contratos){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);  // Feito para calcular o ano do contrato c;
            int c_mes =  1 + cal.get(Calendar.MONTH);// feito para calcular o mes do contrato c; // Foi adicionada +1, por que o mes no calendr começa com 0;
            if(ano == c_ano && mes == c_mes){
                soma += c.totalHora();
            }

        }
        return soma;
    }

 */