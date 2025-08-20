package A7;

public class Cachorro extends Animal{
    public Cachorro(String nome, String cor, double tamanho) {
        super(nome, cor, tamanho);
    }
    @Override
    public void fazerSom(){
        System.out.println("O som é: Au Au");
    }
}
