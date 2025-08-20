package A2;

public class Fruta {
    protected String nome;
    protected double preco = 2.50;
    protected int quantidade;

    public Fruta() {

    }

    public Fruta(String nome, double peso, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
    }

    public double Pagar() {
        return preco * quantidade;
    }
    @Override
    public String toString() {
        return "Nome: " + nome +  "\t Preço: " + preco + "\t Quatidade: " + quantidade + "\t\n";
    }
}
