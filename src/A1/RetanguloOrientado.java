package A1;

import java.util.Scanner;

// Classe Retangulo
class Retangulo {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    // Getters
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}

// Classe principal
public class RetanguloOrientado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo da área de 3 retângulos (Orientado a Objetos)");

        // Array para armazenar os objetos de Retangulo
        Retangulo[] retangulos = new Retangulo[3];

        // Loop para criar 3 objetos de Retangulo
        for (int i = 0; i < 3; i++) {
            System.out.println("\nRetângulo " + (i + 1) + ":");
            System.out.print("Digite a largura: ");
            double largura = scanner.nextDouble();

            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            // Criar objeto Retangulo e armazenar no array
            retangulos[i] = new Retangulo(largura, altura);
        }

        // Exibe as áreas calculadas
        System.out.println("\n Áreas Calculadas! ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Retângulo " + (i + 1) + ":");
            System.out.println("Largura: " + retangulos[i].getLargura());
            System.out.println("Altura: " + retangulos[i].getAltura());
            System.out.println("Área: " + retangulos[i].calcularArea());
        }

        scanner.close();
    }
}