package A4;

import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto = null;
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menu de Operações ===");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Aplicar Desconto");
            System.out.println("3. Exibir Produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    try {
                        produto = new Produto(nome, preco);
                        produto.getNome();
                        produto.getPreco();
                        System.out.println("Produto cadastrado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    if (produto != null) {
                        System.out.print("Digite o percentual de desconto (0-100): ");
                        double desconto = scanner.nextDouble();
                        try {
                            produto.aplicarDesconto(desconto);
                            System.out.println("Desconto aplicado com sucesso!");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Cadastre um produto primeiro!");
                    }
                    break;
                case 3:
                    if (produto != null) {
                        System.out.println(produto.toString());
                    } else {
                        System.out.println("Nenhum produto cadastrado!");
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
