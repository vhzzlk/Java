package A14;

import java.util.Date;
import java.util.Calendar;

public class Emprestimo {
    private final Livro livro;
    private final Usuario usuario;
    private boolean devolvido;
    private Date dataDevolucao;
    private Date dataEmprestimo;

    public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
        this.devolvido = false;
    }
    // ... existing code ...
    // Construtor que define o empréstimo para "agora" e devolução em +12 dias
    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.devolvido = false;

        this.dataEmprestimo = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.dataEmprestimo);
        cal.add(Calendar.DAY_OF_MONTH, 12);
        this.dataDevolucao = cal.getTime();
    }
    // ... existing code ...

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

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
}