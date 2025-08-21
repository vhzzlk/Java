package A9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulador {

    // Função que recebe uma lista de veículos e calcula o tempo (em horas) para 100 km
    public static Map<String, Float> calcularTempos100Km(List<Veiculo> veiculos) {
        final float DISTANCIA = 100.0f;
        Map<String, Float> resultado = new HashMap<>();
        for (Veiculo v : veiculos) {
            float tempo = v.calcularTempo(DISTANCIA);
            resultado.put(v.getModelo(), tempo);
        }
        return resultado;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        Veiculo carro = new Carro("Carro Sedan");
        Veiculo bike = new Bicicleta("Bike Urbana");
        Veiculo onibus = new Onibus("Onibus Linha 10", 3);

        Map<String, Float> tempos = calcularTempos100Km(List.of(carro, bike, onibus));
        tempos.forEach((modelo, tempoHoras) -> {
            System.out.printf("%s: %.2f horas (%.0f min)%n",
                    modelo, tempoHoras, tempoHoras * 60.0f);
        });
    }
}