package A14;


public class Emprestimo {
    private final Livro livro;
    private final Usuario usuario;
    private boolean devolvido;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.devolvido = false;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void marcarDevolvido() {
        this.devolvido = true;
    }
}