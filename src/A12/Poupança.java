package A12;

public class Poupança extends Conta {

    public Poupança(String numero, String agencia, String titular) {
        super(numero, agencia, titular);
    }

    @Override
    public double calcularTarifaMensal() {
        return 0.0;
    }
}