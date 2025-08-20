package A5;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        setTitulo(titulo);
        setAutor(autor);
        setNumeroPaginas(numeroPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas < 5) {
            System.out.println("Erro: O número de páginas não pode ser menor que 5");
            return;
        }
        this.numeroPaginas = numeroPaginas;
    }

    public void imprimir() {
        System.out.println("Título: " + titulo + "\nAutor: " + autor + "\nNúmero de Páginas: " + numeroPaginas);
    }

}
