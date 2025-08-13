package CourseReview.OrientacaoObjetos.ExemploComOODois.application;

public class Jogador {

    private String nome;
    private int idade;
    private String posicao;
    private String nomeTime;
    private int quantidade;

    public Jogador(){

    }

    public Jogador(String nome, int idade, String posicao, String nomeTime, int quantidade){
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.nomeTime = nomeTime;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void addJogador(int quantidade){
        this.quantidade += quantidade;
    }

    public void deletaJogador(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Jogador:\n" +
                "Nome:" + nome;

    }
}
