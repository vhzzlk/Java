package A11;

public class Main {
    public static void main(String[] args) {

        SerVivo bilii = new Humano();
        SerVivo dogao = new Cachorro();

        dogao.setCor(Cores.AZUL);

        Cores batata;
        for (Cores cor :Cores.values()){
            System.out.println(cor +" " +cor.getI());
        }

    }
}
