package A9;

public class Carro extends Veiculo {
    private static final float VELOCIDADE = 80f;

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / VELOCIDADE;
    }
}