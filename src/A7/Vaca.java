package A7;

public class Vaca extends Animal{
    public Vaca(String nome, String cor, double tamanho) {
        super(nome, cor, tamanho);
    }
    @Override
    public void fazerSom(){
        super.fazerSom();
        System.out.println(" Muuuu");
    }
}
