package A14;

// Classe Professor herda da classe Usuario (herança)
// Classe que representa um Professor no sistema
public class Professor extends Usuario {
    // Construtor que inicializa os dados básicos do professor
    public Professor(String nome, String email, int id) {
        super(nome, email, id);
    }

    // Sobrescrita do método da classe pai para definir limite específico para professor
    @Override
    public int getLimiteEmprestimo() {
        return 5;
    }
}