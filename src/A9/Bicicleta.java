package A9;

public class Bicicleta extends Veiculo {
    private static final double VELOCIDADE = 20.0;

    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE;
    }
}