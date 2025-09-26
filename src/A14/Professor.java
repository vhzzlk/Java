package A14;

public class Professor extends Usuario {
    public Professor(String nome, String email, int id) {
        super(nome, email, id);
    }

    @Override
    public int getLimiteEmprestimo() {
        return 5;
    }
}