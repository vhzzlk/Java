package A12;

public class Corrente extends Conta {

    public Corrente(String numero, String agencia, String titular) {
        super(numero, agencia, titular);
    }

    @Override
    public double calcularTarifaMensal() {
        return 12.0;
    }
}