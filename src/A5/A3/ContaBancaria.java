package A3;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    private String tipoConta;

    public ContaBancaria(String titular, String numeroConta, String tipoConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido para saque!");
        return false;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public String toString() {
        return "Conta: " + numeroConta +
                "\nTitular: " + titular +
                "\nTipo: " + tipoConta +
                "\nSaldo atual: R$" + String.format("%.2f", saldo);
    }
}
