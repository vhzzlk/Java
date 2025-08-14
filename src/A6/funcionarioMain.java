package A6;

public class funcionarioMain {
    public static void main(String[] args) {
        engenheiro eng = new engenheiro("Victor", "123456789", 10000, "123456789");
        System.out.println(eng.getNome());

        eng.setNome("Cauê");
        System.out.println(eng.getNome());
    }
}
