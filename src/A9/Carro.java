
package A9;

public class Carro extends Veiculo {
    private static final float VELOCIDADE_MEDIA_KMH = 80.0f;

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        // tempo (h) = distancia (km) / velocidade (km/h)
        return distancia / VELOCIDADE_MEDIA_KMH;
    }
}