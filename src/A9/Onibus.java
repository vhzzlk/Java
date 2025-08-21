package A9;

public class Onibus extends Veiculo {
    private static final float VELOCIDADE = 60f;
    private static final float TEMPO_PARADA_H = 15f / 60f;
    private final int numeroParadas;

    public Onibus(String modelo, int numeroParadas) {
        super(modelo);
        this.numeroParadas = Math.max(0, numeroParadas);
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    @Override
    public float calcularTempo(float distancia) {
        float deslocamento = distancia / VELOCIDADE;
        return deslocamento + numeroParadas * TEMPO_PARADA_H;
    }
}