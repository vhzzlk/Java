package A6;

public class batedeira extends eletrodoméstico{
    private String Potencia;

    public batedeira(String marca, String modelo, double consumo, String cor, String Potencia) {
        super(marca, modelo, consumo, cor);
        this.Potencia = Potencia;
    }

    public String getPotencia() {
        return Potencia;
    }
    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }
}
