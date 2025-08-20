package A6;

public class eletrodoméstico {
    private String marca;
    private String modelo;
    private double consumo;
    private String cor;

    public eletrodoméstico(String marca, String modelo, double consumo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getConsumo() {
     return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

}
