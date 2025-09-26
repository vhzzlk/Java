package A14;

public abstract class Usuario {
    private String nome;
    private String email;
    private int id;

    public Usuario(String nome, String email, int id) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract int getLimiteEmprestimo();

    @Override
    public String toString() {
        return "id :" + id + " | nome :" + nome + " | email :" + email;
    }
}