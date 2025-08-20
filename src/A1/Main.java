package A1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa("Danilo", "Masculino!", 20, 70.5, 1.75);


        System.out.println(p1);
        System.out.printf("IMC: %.2f", p1.imc());

    }
}
