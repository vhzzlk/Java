package A14;

import java.time.LocalDate;

// Classe que representa um empréstimo de livro, demonstrando encapsulamento
// e composição através do relacionamento com Livro e Usuario
public class Emprestimo {
    // Atributos privados demonstrando encapsulamento e composição com outras classes
    private final Livro livro;  // Composição com a classe Livro
    private final Usuario usuario;  // Composição com a classe Usuario
    private boolean devolvido;  // Atributo encapsulado para controle interno
    private LocalDate dataDevolucao;  // Data encapsulada
    private LocalDate dataEmprestimo;  // Data encapsulada

    // Construtor completo que inicializa todos os atributos do objeto
    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
        this.devolvido = false;
    }

    // Construtor sobrecarregado demonstrando polimorfismo
    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.devolvido = false;

        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = this.dataEmprestimo.plusDays(12);
    }

    // Método getter que demonstra encapsulamento, permitindo acesso controlado ao livro
    public Livro getLivro() {
        return livro;
    }

    // Método getter que demonstra encapsulamento, permitindo acesso controlado ao usuario
    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void marcarDevolvido() {
        this.devolvido = true;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}