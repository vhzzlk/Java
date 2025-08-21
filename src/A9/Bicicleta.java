package A9;

public class Bicicleta extends Veiculo {
    private float VELOCIDADE = 20.0f;

    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / VELOCIDADE;
    }
}