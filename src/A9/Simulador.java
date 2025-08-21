package A9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulador {
    public static Map<String, Float> calcularTempos100Km(List<Veiculo> veiculos) {
        Map<String, Float> r = new HashMap<>();
        for (Veiculo v : veiculos) {
            r.put(v.getModelo(), v.calcularTempo(100f));
        }
        return r;
    }

    public static void main(String[] args) {
        Veiculo b = new Bicicleta("Bike");
        Veiculo c = new Carro("Carro");
        Veiculo o = new Onibus("Onibus", 3);
        Map<String, Float> tempos = calcularTempos100Km(List.of(b, c, o));
        tempos.forEach((m, t) -> System.out.printf("%s: %.2f horas%n", m, t));
    }
}