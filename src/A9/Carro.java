package A9;

public class Carro extends Veiculo {
    private static final double VELOCIDADE = 80.0;

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE;
    }
}