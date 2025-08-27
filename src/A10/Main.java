package A10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> banco = new ArrayList<>();
        List<Pessoa> cache = new ArrayList<>();

        banco.add(new Pessoa(1, "Ana", 25));
        banco.add(new Pessoa(2, "Bruno", 30));
        banco.add(new Pessoa(3, "Carla", 22));
        banco.add(new Pessoa(4, "Douglas", 20));
        banco.add(new Pessoa(5, "Eduardo", 28));
        banco.add(new Pessoa(6, "Fabio", 24));
        banco.add(new Pessoa(7, "Gustavo", 26));
        banco.add(new Pessoa(8, "Helena", 21));
        banco.add(new Pessoa(9, "Isabella", 27));
        banco.add(new Pessoa(10, "Jose", 23));
        banco.add(new Pessoa(11, "Karen", 29));

        boolean continuar = true;
        while (continuar) {

            System.out.println("\n1)Adicionar pessoa por ID no Cache");
            System.out.println("2) Mostrar cache");
            System.out.println("3) Mostrar banco");
            System.out.println("4) Buscar pessoa pelo ID");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID: ");
                    int idBuscado = sc.nextInt();

                    Pessoa encontrada = null;


                    for (Pessoa p : banco) {
                        if (p.getId() == idBuscado) {
                            encontrada = p;
                            break;
                        }
                    }

                    if (encontrada != null) {
                        if (cache.contains(encontrada)) {
                            System.out.println("Está Pessoa já está no cache.");
                            break;
                        } else if ( !cache.contains(encontrada)){
                            if (cache.size() >= 10) {

                                cache.remove(0);
                            }
                            cache.add(encontrada);
                            System.out.println("Pessoa buscada no banco e adicionada ao cache: " + encontrada);
                        } else{
                            System.out.println("Pessoa não encontrada.");
                        }
                    }


                    break;

                case 2:
                    System.out.println("\n=== Cache (" + cache.size() + ") ===");

                    if (cache.isEmpty()) {
                        System.out.println("(vazio)");
                    } else {
                        for (Pessoa p : cache) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== Banco (" + banco.size() + ") ===");
                    if (banco.isEmpty()) {
                        System.out.println("(vazio)");
                    } else {
                        for (Pessoa p : banco) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o ID: ");
                    int idBusca = sc.nextInt();

                    Pessoa achada = null;

                    // 1) Procura no cache
                    for (Pessoa j : cache) {
                        if (j.getId() == idBusca) {
                            achada = j;
                            System.out.println("Encontrada no cache: " + achada);
                            break;
                        }
                    }

                    // 2) Se não achou no cache, procura no banco
                    if (achada == null) {
                        for (Pessoa p : banco) {
                            if (p.getId() == idBusca) {
                                achada = p;
                                System.out.println("Encontrada no banco: " + achada);
                                // opcional: adicionar ao cache para próximas buscas
                                // cache.add(p);
                                break;
                            }
                        }
                    }

                    // 3) Se ainda não achou
                    if (achada == null) {
                        System.out.println("Pessoa não encontrada.");
                    }

                    break;

                case 0:
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }


        sc.close();
    }
}