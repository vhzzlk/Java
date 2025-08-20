package A1;

public class Pessoa {

    protected String nome;
    protected String genero;
    protected int idade;
    protected double peso;
    protected double altura;

    public Pessoa(String nome, String genero, int idade, double peso, double altura) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nGenero: " + genero + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura + "\n";
    }

    public double imc() {
        return peso / (altura * altura);
    }


}
