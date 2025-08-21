package A9;

public class Onibus extends Veiculo {
    private static final float VELOCIDADE_MEDIA_KMH = 60.0f;
    private static final float TEMPO_POR_PARADA_HORAS = 15.0f / 60.0f; // 15 minutos

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
        float tempoDeslocamento = distancia / VELOCIDADE_MEDIA_KMH;
        float tempoParadas = numeroParadas * TEMPO_POR_PARADA_HORAS;
        return tempoDeslocamento + tempoParadas;
    }
}