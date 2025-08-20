package A4;

public class Pessoa {
    private String nome;
    private int idade;

    public void nome(String nome) {
        this.nome = nome;
        System.out.println("Nome: " + nome);
        
    }
    public void idade(int idade) {
        this.idade = idade;
        System.out.println("Idade: " + idade);
        if (idade > 0) {
            System.out.println("Pessoa cadastrada com sucesso!");
        }else {
            System.out.println("Digite uma idade maior que 0 para calcular a idade em anos.");
        }
    }
    public void imprimir() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }
    
    
}
