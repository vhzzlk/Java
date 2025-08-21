package A9;

public abstract class Veiculo {
    private final String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void iniciar() {
        System.out.println("Veiculo esta iniciando...");
    }

    // Tempo em horas para a distância informada (km)
    public abstract float calcularTempo(float distancia);
}