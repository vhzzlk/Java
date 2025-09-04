package A12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Abertura de Conta ===");
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1 - Conta Corrente (CC)");
        System.out.println("2 - Conta Poupança (CP)");
        System.out.println("3 - Conta Pessoa Jurídica (PJ)");
        System.out.print("Opção: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o número da conta: ");
        String numero = sc.nextLine();

        System.out.print("Informe a agência: ");
        String agencia = sc.nextLine();

        System.out.print("Informe o titular: ");
        String titular = sc.nextLine();

        Conta conta;
        if (tipo == 1) {
            conta = new Corrente(numero, agencia, titular);
        } else if (tipo == 2) {
            conta = new Poupança(numero, agencia, titular);
        } else if (tipo == 3) {
            conta = new Pj(numero, agencia, titular);
        } else {
            System.out.println("Tipo de conta inválido. Encerrando.");
            sc.close();
            return;
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menu de Operações ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("4 - Mostrar tarifa mensal");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: ");
                    double vDep = sc.nextDouble();
                    conta.depositar(vDep);
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    double vSaq = sc.nextDouble();
                    conta.sacar(vSaq);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    double tarifa = conta.calcularTarifaMensal();
                    System.out.printf("Tarifa mensal: R$ %.2f%n", tarifa);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
        System.out.println("Obrigado por usar o sistema bancário!");
    }
}