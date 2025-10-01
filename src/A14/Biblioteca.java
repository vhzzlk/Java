package A14;

import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

// Classe principal que gerencia uma biblioteca
public class Biblioteca {

    // Atributos privados (encapsulamento) para armazenar os dados
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    // Lista que representa a relação entre Livros e Usuários (composição)
    private List<Emprestimo> emprestimos = new ArrayList<>();

    // Método público que encapsula a adição de livros à biblioteca
    public void adicionarLivro(Livro l) {
        if (buscarLivroPorCodigo(l.codigo()) == null) {
            livros.add(l);
            System.out.println("Livro adicionado: " + l.codigo() + " - " + l.titulo());
        } else {
            System.out.println("Livro já cadastrado: " + l.codigo());
        }
    }

    public void adicionarUsuario(Usuario u) {
        if (buscarUsuarioPorId(u.id()) == null) {
            usuarios.add(u);
            System.out.println("Usuário cadastrado: " + u.id() + " - " + u.nome());
        } else {
            System.out.println("Usuário já cadastrado: " + u.id());
        }
    }

    // Método sobrecarregado que recebe um objeto Usuario
    public String emprestarLivro(Usuario u, String codigo) {
        Livro livro = buscarLivroPorCodigo(codigo);
        if (livro == null) {
            return "livro não encontrado";
        }
        if (!livro.isDisponivel()) {
            return "livro indisponível";
        }
        int ativos = contarEmprestimosAtivos(u);
        if (ativos >= u.getLimiteEmprestimo()) {
            return "limite de empréstimos excedido";
        }

        livro.emprestar(u);
        emprestimos.add(new Emprestimo(livro, u));
        return "empréstimo realizado: " + livro.titulo() + " para " + u.nome();
    }

    // Sobrecarga do método que recebe o ID do usuário
    public String emprestarLivro(int idUsuario, String codigo) {
        Usuario u = buscarUsuarioPorId(idUsuario);
        if (u == null) {
            return "usuário não encontrado";
        }
        return emprestarLivro(u, codigo);
    }

    public String devolverLivro(Usuario u, String codigo) {
        Livro livro = buscarLivroPorCodigo(codigo);
        if (livro == null) {
            return "livro não encontrado";
        }

        for (Emprestimo e : emprestimos) {
            if (!e.isDevolvido() && e.getUsuario().id() == u.id() && e.getLivro().codigo().equals(codigo)) {
                e.marcarDevolvido();
                livro.devolver();
                return "devolução realizada: " + livro.titulo() + " por " + u.nome();
            }
        }
        return "empréstimo não encontrado para este usuário e livro";
    }

    // ... existing code ...
    // Método privado (encapsulamento) para busca interna de livros
    private Livro buscarLivroPorCodigo(String codigo) {
        for (Livro l : livros) {
            if (l.codigo().equals(codigo)) {
                return l;
            }
        }
        return null;
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario u : usuarios) {
            if (u.id() == id) {
                return u;
            }
        }
        return null;
    }

    private int contarEmprestimosAtivos(Usuario u) {
        int c = 0;
        for (Emprestimo e : emprestimos) {
            if (!e.isDevolvido() && e.getUsuario().id() == u.id()) {
                c++;
            }
        }
        return c;
    }

    public void listarCatalogo() {
        System.out.println("Catálogo:");
        for (Livro l : livros) {
            System.out.println("- " + l.codigo() + " | " + l.titulo() + " | " + l.autor() + " | " + l.status());
        }
    }

    public void listarEmprestimosPorUsuario(int idUsuario) {
        Usuario u = buscarUsuarioPorId(idUsuario);
        if (u == null) {
            System.out.println("usuário não encontrado");
            return;
        }
        System.out.println("Empréstimos ativos do usuário " + u.nome() + " (id=" + u.id() + "):");
        boolean encontrou = false;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Emprestimo e : emprestimos) {
            if (!e.isDevolvido() && e.getUsuario().id() == idUsuario) {
                Livro l = e.getLivro();
                System.out.println("- " + l.codigo() + " | " + l.titulo() + " | " + l.autor()
                        + " | emprestado em: " + e.getDataEmprestimo().format(fmt)
                        + " | devolução: " + e.getDataDevolucao().format(fmt));
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum empréstimo ativo para este usuário.");
        }
    }

    public String devolverLivro(int idUsuario, String codigo) {
        Usuario u = buscarUsuarioPorId(idUsuario);
        if (u == null) {
            return "usuário não encontrado";
        }
        return devolverLivro(u, codigo);
    }

    public void listarUsuarios() {
        System.out.println("Usuários cadastrados:");
        if (usuarios.isEmpty()) {
            System.out.println("- (nenhum usuário cadastrado)");
            return;
        }
        for (Usuario u : usuarios) {
            System.out.println("- id=" + u.id() + " | nome=" + u.nome() + " | email=" + u.email());
        }
    }
}