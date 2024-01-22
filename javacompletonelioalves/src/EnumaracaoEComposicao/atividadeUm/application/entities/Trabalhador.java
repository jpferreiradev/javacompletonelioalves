package EnumaracaoEComposicao.atividadeUm.application.entities;

import EnumaracaoEComposicao.atividadeUm.application.entities.enums.NivelTrabalho;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    //Atributos
    private String name;
    private NivelTrabalho nivelTrabalho;
    private Double salarioBase;

    //Associações
    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>(); // Por ter varios contratos, foi feito uma lista;

    // Construtores
    public Trabalhador(){

    }
    public Trabalhador(String name, NivelTrabalho nivelTrabalho, double salarioBase, Departamento departamento){
        this.name = name;
        this.nivelTrabalho = nivelTrabalho;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public NivelTrabalho getNivelTrabalho(){
        return nivelTrabalho;
    }
    public void setNivelTrabalho(NivelTrabalho nivelTrabalho){
        this.nivelTrabalho = nivelTrabalho;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public void adicionarContrato(HoraContrato contrato){

    }
    public void removerContrato(HoraContrato contrato){

    }
    public double renda(Integer ano, Integer mes){
        return 0;
    }
}

// Falta os get e set de Departamento a Listas