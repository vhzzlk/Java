package Encapsulamento;

public class MusicaMain1 {
    public static void main(String[] args) {
        Musica1 music = new Musica1();

        music.setTitulo("24k Magic");
        music.setDuracao(354);
        music.setArtista("Bruno Mars!");
        music.setGenero("Pop");
        music.setAnoLancamento(2019);

        music.tocar();
        System.out.println("----------------------------------");
        System.out.println(music);
    }
}
