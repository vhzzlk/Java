package A9;

public class Simulador {
    public static void calcularTempos100Km(Veiculo[] veiculos) {
        for (Veiculo v : veiculos) {
            double t = v.calcularTempo(100.0);
            System.out.printf("%s: %.2f horas%n", v.getModelo(), t);
        }
    }

    public static void main(String[] args) {
        Veiculo b = new Bicicleta("Bicicleta");
        Veiculo c = new Carro("Carro");
        Veiculo o = new Onibus("Onibus", 3);
        Veiculo[] vs = { b, c, o };
        calcularTempos100Km(vs);
    }
}