package A2;

import java.util.Scanner;

public class FrutaMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fruta fruta = new Fruta();

        System.out.println("Digite o nome da fruta: ");
        fruta.nome = scanner.nextLine();
        System.out.println("O preço dela é: " + fruta.preco);
        System.out.println("Quantas frutas você deseja comprar: ");
        fruta.quantidade = scanner.nextInt();

        System.out.println(fruta);
        System.out.println("Preço a se pagar : " + fruta.Pagar());
    }
}
