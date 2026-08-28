package Secao_12.exemploAtividade.entities;

import Secao_12.exemploAtividade.enums.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private Double baseSalario;
    private NivelTrabalhador nivel;

    // Assosiações
    private Departamento departamento; //Composição de objetos
    private List<HoraContrato> contratos = new ArrayList<>(); // Usou composição de objetos, nunca incluir no construtor;


    public Trabalhador() {

    }

    public Trabalhador(String nome, double baseSalario, NivelTrabalhador nivel, Departamento departamento) {
        this.nome = nome;
        this.baseSalario = baseSalario;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getBaseSalario() {
        return baseSalario;
    }

    public void setBaseSalario(Double baseSalario) {
        this.baseSalario = baseSalario;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
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

    // Adicionar um contrato
    public void adicionarContrato(HoraContrato contrato) {
        contratos.add(contrato);
    }

    // remover um contrato
    public void removerContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }


    // Aqui é um exemplo usando ainda Calender
    public double renda(int ano, int mes) {
        double soma = baseSalario;
        Calendar cal = Calendar.getInstance();
        for (HoraContrato s : contratos) {
            cal.setTime(s.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && c_mes == mes) {
                soma += s.valorTotalContrato();
            }
        }
        return soma;
    }
}
