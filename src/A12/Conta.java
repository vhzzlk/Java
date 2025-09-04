package A12;

public abstract class Conta {
    private String numero;
    private String agencia;
    private String titular;
    protected double saldo;
    private boolean tarifaMensalCobrada;

    public Conta(String numero, String agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 0.0;
        this.tarifaMensalCobrada = false;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }


        saldo += valor;


        if (!tarifaMensalCobrada && valor > 20.0) {
            double tarifa = calcularTarifaMensal();
            if (tarifa > 0.0) {
                if (saldo >= tarifa) {
                    saldo -= tarifa;
                    tarifaMensalCobrada = true;
                    System.out.println("Depósito: R$ " + String.format("%.2f", valor)
                            + " | Tarifa mensal (1ª vez): R$ " + String.format("%.2f", tarifa));
                    return;
                } else {

                    System.out.println("Depósito: R$ " + String.format("%.2f", valor)
                            + " | Tarifa mensal não aplicada (saldo insuficiente).");
                    return;
                }
            }
        }

        System.out.println("Depósito realizado: R$ " + String.format("%.2f", valor));
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        double taxa = getTaxaSaque();
        double total = valor + taxa;

        if (saldo < total) {
            System.out.println("Saldo insuficiente para saque. Necessário: R$ " + String.format("%.2f", total));
            return;
        }

        saldo -= total;

        if (taxa > 0) {
            System.out.println("Saque: R$ " + String.format("%.2f", valor)
                    + " | Taxa: R$ " + String.format("%.2f", taxa));
        } else {
            System.out.println("Saque: R$ " + String.format("%.2f", valor));
        }
    }

    public void exibirSaldo() {
        System.out.println(
                "Agência: " + agencia +
                        " | Conta: " + numero +
                        " | Titular: " + titular +
                        " | Saldo: R$ " + String.format("%.2f", saldo)
        );
    }


    public void aplicarTarifaMensal() {
        double tarifa = calcularTarifaMensal();
        if (tarifa <= 0) {
            System.out.println("Não há tarifa mensal para este tipo de conta.");
            return;
        }
        if (saldo < tarifa) {
            System.out.println("Saldo insuficiente para aplicar a tarifa mensal de R$ "
                    + String.format("%.2f", tarifa));
            return;
        }
        saldo -= tarifa;
        System.out.println("Tarifa mensal aplicada: R$ " + String.format("%.2f", tarifa));
    }


    protected double getTaxaSaque() {
        return 0.0;
    }

    public abstract double calcularTarifaMensal();
}