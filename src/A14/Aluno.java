package A14;

// Classe Aluno herda da classe Usuario - exemplo de herança
public class Aluno extends Usuario {
    // Construtor da classe que recebe nome, email e id
    public Aluno(String nome, String email, int id) {
        super(nome, email, id);
    }

    // Sobrescrita do método da classe pai - exemplo de polimorfismo
    @Override
   public int getLimiteEmprestimo() {
        return 2;
    }
}
