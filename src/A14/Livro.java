package A14;

// Classe que representa um livro e implementa interface Imprestavel para permitir empréstimos
public class Livro implements Imprestavel {
    private String codigo;
    private String titulo;
    private String autor;
    private Status status;

    // Construtor que inicializa os atributos do livro
    public Livro(String codigo, String titulo, String autor, String status) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.status = "EMPRESTADO".equalsIgnoreCase(status) ? Status.EMPRESTADO : Status.DISPONIVEL;
    }

    // Método getter que retorna o código do livro
    public String codigo() {
        return codigo;
    }

    // Método setter que atualiza o código do livro
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

    // Método que verifica se o livro está disponível para empréstimo
    public boolean isDisponivel() {
        return status == Status.DISPONIVEL;
    }

    // Implementação do método da interface para emprestar o livro
    @Override
public void emprestar(Usuario u){
        this.status = Status.EMPRESTADO;
        System.out.println("Livro " + codigo + " emprestado para o usuário: " + u.nome());
    }

    // Implementação do método da interface para devolver o livro
    @Override
    public void devolver() {
        this.status = Status.DISPONIVEL;
        System.out.println("Livro " + codigo + " devolvido. Agora está disponível.");
    }
}