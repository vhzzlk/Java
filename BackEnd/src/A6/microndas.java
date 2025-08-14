package A6;

public class microndas extends eletrodoméstico{
    private double capacidade;

    public microndas(String marca, String modelo, double consumo, String cor, double capacidade) {
        super(marca, modelo, consumo, cor);
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

}
