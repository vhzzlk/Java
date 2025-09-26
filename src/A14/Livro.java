package A14;

public class Livro implements Imprestavel {
    private String codigo;
    private String titulo;
    private String autor;
    private Status status;

    public Livro(String codigo, String titulo, String autor, String status) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.status = "EMPRESTADO".equalsIgnoreCase(status) ? Status.EMPRESTADO : Status.DISPONIVEL;
    }

    public String codigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Status status() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String autor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String titulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return status == Status.DISPONIVEL;
    }

    @Override
public void emprestar(Usuario u){
        this.status = Status.EMPRESTADO;
        System.out.println("Livro " + codigo + " emprestado para o usuário: " + u.nome());
    }

    @Override
    public void devolver() {
        this.status = Status.DISPONIVEL;
        System.out.println("Livro " + codigo + " devolvido. Agora está disponível.");
    }
}