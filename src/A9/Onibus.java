package A9;

public class Onibus extends Veiculo {
    private static final double VELOCIDADE = 60.0;
    private static final double TEMPO_PARADA_H = 15.0 / 60.0;
    private final int numeroParadas;

    public Onibus(String modelo, int numeroParadas) {
        super(modelo);
        this.numeroParadas = Math.max(0, numeroParadas);
    }

    @Override
    public double calcularTempo(double distancia) {
        return (distancia / VELOCIDADE) + (numeroParadas * TEMPO_PARADA_H);
    }
}