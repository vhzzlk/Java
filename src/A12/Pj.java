package A12;

public class Pj extends Conta {

    public Pj(String numero, String agencia, String titular) {
        super(numero, agencia, titular);
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.0;
    }

    @Override
    protected double getTaxaSaque() {
        return 1.5;
    }
}