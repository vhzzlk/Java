package A1;

import java.util.Scanner;

public class RetanguloEstrutural {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo da área de 3 retângulos (Estrutural)");

        // Armazena as áreas calculadas
        double[] areas = new double[3];

        // Loop para receber as dimensões dos 3 retângulos
        for (int i = 0; i < 3; i++) {
            System.out.println("\nRetângulo " + (i + 1) + ":");
            System.out.print("Digite a largura!: ");
            double largura = scanner.nextDouble();

            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            // Calcula a área e armazena no array
            areas[i] = largura * altura;
        }

        // Exibe as áreas calculadas
        System.out.println("\nÁreas Calculadas");
        for (int i = 0; i < 3; i++) {
            System.out.println("Área do Retângulo " + (i + 1) + ": " + areas[i]);
        }

        scanner.close();
    }
}