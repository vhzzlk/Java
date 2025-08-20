package A7;

public class Gato extends Animal{
    public Gato(String nome, String cor, double tamanho) {
        super(nome, cor, tamanho);
    }
    @Override
    public void fazerSom(){
        System.out.println("O som é: Miau");
    }
}
