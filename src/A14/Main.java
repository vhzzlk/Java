package A14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instanciação da classe Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Menu Biblioteca ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Listar catálogo");
            System.out.println("4 - Emprestar livro (id do usuário e código)");
            System.out.println("5 - Devolver livro (id do usuário e código)");
            System.out.println("6 - Ver livros emprestados por id do usuário");
            System.out.println("7 - Listar usuários");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.println("Tipo de usuário: 1 - Aluno | 2 - Professor");
                    System.out.print("Escolha: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Tipo inválido.");
                        break;
                    }
                    // Polimorfismo: Usuario pode ser Aluno ou Professor (herança)
                    Usuario novo = (tipo == 1)
                            ? new Aluno(nome, email, id)
                            : new Professor(nome, email, id);
                    // Encapsulamento: acesso ao método através do objeto
                    biblioteca.adicionarUsuario(novo);
                    break;

                case 2:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine().trim();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine().trim();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine().trim();
                    // Criação de objeto da classe Livro
                    Livro livro = new Livro(codigo, titulo, autor, "DISPONIVEL");
                    // Encapsulamento: método da classe Biblioteca
                    biblioteca.adicionarLivro(livro);
                    break;

                case 3:
                    biblioteca.listarCatalogo();
                    break;

                case 4:
                    System.out.print("Id do usuário: ");
                    int idEmp = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Código do livro: ");
                    String codEmp = sc.nextLine().trim();
                    System.out.println(biblioteca.emprestarLivro(idEmp, codEmp));
                    // Exibe as datas logo após o empréstimo
                    biblioteca.listarEmprestimosPorUsuario(idEmp);
                    break;

                case 5:
                    System.out.print("Id do usuário: ");
                    int idDev = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Código do livro: ");
                    String codDev = sc.nextLine().trim();
                    System.out.println(biblioteca.devolverLivro(idDev, codDev));
                    break;

                case 6:
                    System.out.print("Id do usuário: ");
                    int idVis = sc.nextInt();
                    sc.nextLine();
                    biblioteca.listarEmprestimosPorUsuario(idVis);
                    break;

                case 7:
                    biblioteca.listarUsuarios();
                    break;

                case 8:
                    executando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }
}