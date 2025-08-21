package A9;

public class Carro extends Veiculo {
    private  float VELOCIDADE = 80.0f;

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / VELOCIDADE;
    }
}