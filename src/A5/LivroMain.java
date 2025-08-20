package A5;

import java.util.Scanner;

public class LivroMain {
    public static void main(String[] args) {
        Livro livro = new Livro("", "", 0);
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menu de Operações ===");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Exibir Dados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o número de páginas: ");
                    int numeroPaginas = scanner.nextInt();
                    livro.setTitulo(titulo);
                    livro.setAutor(autor);
                    livro.setNumeroPaginas(numeroPaginas);
                    System.out.println("Livro cadastrado com sucesso!!");
                    break;
                case 2:
                    livro.imprimir();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
