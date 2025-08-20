package A7;

public class Animal {
    private String nome;
    private String cor;
    private double tamanho;

    public Animal(String nome, String cor, double tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public void comer() {
        System.out.println("Comendo...");
    }
    public void fazerSom(){
        System.out.println("O som é : aleluia");
    }

}
