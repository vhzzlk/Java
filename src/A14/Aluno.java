package A14;

public class Aluno extends Usuario{
    public Aluno(String nome, String email, int id) {
        super(nome, email, id);
    }

    @Override
   public int getLimiteEmprestimo() {
        return 2;
    }
}
