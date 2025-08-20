package Encapsulamento;

public class Musica {
    private String titulo;
    private int duracao;
    private String artista;
    private String genero;
    private int anoLancamento;
    
    public Musica(String titulo, int duracao, String artista, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.artista = artista;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }
    public Musica() {

    }

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

}
