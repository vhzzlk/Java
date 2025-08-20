package A3;

import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", "1234-5", "Corrente");
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menu de Operações ===");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\n" + conta.toString());
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    try {
                        double valor = scanner.nextDouble();
                        conta.depositar(valor);
                    } catch (Exception e) {
                        System.out.println("Valor inválido!");
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    try {
                        double valor = scanner.nextDouble();
                        conta.sacar(valor);
                    } catch (Exception e) {
                        System.out.println("Valor inválido!!");
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
