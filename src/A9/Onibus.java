package A9;

public class Onibus extends Veiculo {
    private  float VELOCIDADE = 60.0f;
    private  float TEMPO_PARADA_H = 15.0f / 60.0f;
    private  int numeroParadas;

    public int numeroParadas() {
        return numeroParadas;
    }
    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public Onibus(String modelo) {
        super(modelo);

    }

    @Override
    public float calcularTempo(float distancia) {
        return (distancia / VELOCIDADE) + (this.numeroParadas * TEMPO_PARADA_H);
    }
}