package A5;

import java.util.Scanner;
import java.util.Random;

public class PersonagemRpgMain {
    public static void main(String[] args) {
        PersonagemRPG personagem = null;
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menu de Personagem RPG ===");
            System.out.println("1. Criar Personagem");
            System.out.println("2. Exibir Status");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a classe: ");
                    String classe = scanner.nextLine();
                    System.out.println("1O seu nivel é 1"); // Nível inicial sempre será 1
                    int vida = new Random().nextInt(101); // Gera número aleatório entre 0 e 100
                    System.out.println("Vida inicial gerada: " + vida);
                    personagem = new PersonagemRPG(nome, classe, 1, vida);
                    System.out.println("Personagem criado com sucesso!");
                    break;
                case 2:
                    if (personagem != null) {
                        System.out.println("\nStatus do Personagem:");
                        System.out.println("Nome: " + personagem.getNome());
                        System.out.println("Classe: " + personagem.getClasse());
                        System.out.println("Nível: " + personagem.getNivel());
                        System.out.println("Vida: " + personagem.getVida());
                    } else {
                        System.out.println("Nenhum personagem criado ainda!!");
                    }
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
