package A9;

public class Veiculo {
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

    public double calcularTempo(double distancia) {
        return 0.0;
    }
}