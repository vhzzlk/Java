package Encapsulamento;

public class Musica1 {
    private String titulo;
    private int duracao;
    private String artista;
    private String genero;
    private int anoLancamento;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void tocar() {
        System.out.println("A musica é: " + titulo + " de " + artista + "");
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\t duracao: " + duracao + "\t artista: '" + artista + "\t genero: " + genero + "\t anoLancamento: " + anoLancamento + "\t\n";
    }
}

