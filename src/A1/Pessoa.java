package A1;

public class Pessoa {

    protected String nome;
    protected String genero;
    protected int idade;
    protected double peso;
    protected double altura;

    @Override
    public String toString() {
        return "Nome: " + nome + "\nGenero: " + genero + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura;
    }

    public double imc() {
        return peso / (altura * altura);
    }


}
