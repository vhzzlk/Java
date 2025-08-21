package A9;

import java.util.Scanner;


public class Simulador {
    public static void calcularTempos100Km(Veiculo[] veiculos) {
        for (Veiculo v : veiculos) {
            double t = v.calcularTempo(100.0f);
            System.out.printf("%s: %.2f horas%n", v.getModelo(), t);
        }
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);



        Veiculo b = new Bicicleta("Bicicleta");
        Veiculo c = new Carro("Carro");
        Onibus o = new Onibus("Onibus");
        System.out.println("Digite o numero de paradas: ");
        o.setNumeroParadas(scanner.nextInt());
        Veiculo[] vs = { b, c, o };
        calcularTempos100Km(vs);

    }
}