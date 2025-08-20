package A6;

public class funcionario {

    private String nome;
    private String rg;
    private double salario;

    public funcionario(String nome, String rg, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public double getSalario() {
        return salario;
    }
    public double calcularSalario() {
        return salario = salario - 100;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "funcionario{" + "nome=" + nome + ", rg=" + rg + ", salario=" + salario ;
    }


}
