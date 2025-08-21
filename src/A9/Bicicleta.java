package A9;

public class Bicicleta extends Veiculo {
    private static final float VELOCIDADE_MEDIA_KMH = 20.0f;

    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / VELOCIDADE_MEDIA_KMH;
    }
}
