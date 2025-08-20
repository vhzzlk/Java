package Encapsulamento;

public class MusicaMain {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Bohemian Rhapsody", 354, "Queen", "Rock", 1975);
        Musica musica2 = new Musica("Thriller", 358, "Michael Jackson", "Pop", 1982);

        System.out.println("Música 1:");
        System.out.println("Título: " + musica1.getTitulo());
        System.out.println("Duração: " + musica1.getDuracao() + " segundos!");
        System.out.println("Artista: " + musica1.getArtista());
        System.out.println("Gênero: " + musica1.getGenero());
        System.out.println("Ano: " + musica1.getAnoLancamento());

        System.out.println("\nMúsica 2:");
        System.out.println("Título: " + musica2.getTitulo());
        System.out.println("Duração: " + musica2.getDuracao() + " segundos");
        System.out.println("Artista: " + musica2.getArtista());
        System.out.println("Gênero: " + musica2.getGenero());
        System.out.println("Ano: " + musica2.getAnoLancamento());

        // Demonstrando o uso dos setters
        musica1.setGenero("Rock Progressivo");
        System.out.println("\nGênero atualizado da música 1: " + musica1.getGenero());
    }
}
