package A6;

public class Eletricista extends funcionario{
    private boolean nr10;

    public Eletricista(String nome, String rg, double Salario, boolean nr10) {
        super(nome, rg, Salario);
        this.nr10 = nr10;
    }

        public double calcularSalario() {
        return super.getSalario() + (nr10 ? 1000 : 0);
        }

}
