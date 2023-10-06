public class Carro {

        private String nome;
        private String modelo;
        private String marca;
        private int velocidade;
        private double peso;

        Carro(String nome, String modelo, String marca, int velocidade, double peso){
            this.nome = nome;
            this.modelo = modelo;
            this.marca = marca;
            this.velocidade = velocidade;
            this.peso = peso;
        }
        Carro(){

        }
        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidade=" + velocidade +
                ", peso=" + peso +
                '}';
    }
}
