package A6;

public class eletrodomésticoMain {
    public static void main(String[] args) {
        microndas microndas = new microndas("Microndas", "Micronda 1000", 100, "Vermelho", 100);
        System.out.println(microndas.getCor());
        microndas.setCor("Azul");
        System.out.println(microndas.getCor());

    }
}
