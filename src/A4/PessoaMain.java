package A4;

import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menu de Operações ===");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Exibir Dados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    pessoa.nome(nome);
                    pessoa.idade(idade);
                    break;
                case 2:
                    pessoa.imprimir();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }
        }
        scanner.close();
    }
}
