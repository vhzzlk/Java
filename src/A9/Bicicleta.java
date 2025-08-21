package A9;

public class Bicicleta extends Veiculo {
    private static final float VELOCIDADE = 20f;

    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / VELOCIDADE;
    }
}