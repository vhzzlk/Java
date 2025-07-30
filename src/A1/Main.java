package A1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        p1.nome = "Danilo";
        p1.genero = "Masculino";
        p1.idade = 20;
        p1.peso = 70.5;
        p1.altura = 1.75;
        System.out.println(p1);
        System.out.printf("IMC: %.2f", p1.imc());

    }
}
