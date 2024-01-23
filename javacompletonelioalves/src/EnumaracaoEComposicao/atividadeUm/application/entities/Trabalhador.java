package EnumaracaoEComposicao.atividadeUm.application.entities;

import EnumaracaoEComposicao.atividadeUm.application.entities.enums.NivelTrabalho;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    //Atributos
    private String name;
    private NivelTrabalho nivel;
    private Double salarioBase;

    //Associações
    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>(); // Por ter varios contratos, foi feito uma lista; Composição tem muitos;

    // Construtores
    public Trabalhador(){ // Construtor padrão

    }
    public Trabalhador(String name, NivelTrabalho nivelTrabalho, double salarioBase, Departamento departamento){ // Construtor com arqgumentos
        this.name = name;
        this.nivel = nivelTrabalho;
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
        return nivel;
    }
    public void setNivelTrabalho(NivelTrabalho nivelTrabalho){
        this.nivel = nivelTrabalho;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public Departamento getDepartamento(){
        return this.departamento = departamento;
    }
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }


    public void adicionarContrato(HoraContrato contrato){
        contratos.add(contrato); // metodo usando ArrayList
    }
    public void removerContrato(HoraContrato contrato){
        contratos.remove(contrato); // metodo usando ArrayList
    }
   /*
    public double renda(Integer ano, Integer mes){
        double soma = salarioBase;
        for(HoraContrato c : contratos){

        }
    }
    */
}


