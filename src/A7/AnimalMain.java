package A7;

public class AnimalMain {
    static void main() {
        Vaca vaca = new Vaca("Mimosa", "Pintada", 2);
        Gato gato = new Gato("Mio", "Rosa", 1);
        Cachorro cachorro = new Cachorro("Rex", "Preto", 3);

        vaca.fazerSom();
        gato.fazerSom();
        cachorro.fazerSom();

    }
}

