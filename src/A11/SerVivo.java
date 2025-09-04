package A11;

abstract class SerVivo {
    private Cores cor;
    private int peso;

    public SerVivo() {

    }

    public Cores getCor() {
        return cor;
    }
    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public int peso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
  abstract void respirar();
}
