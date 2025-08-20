package A6;

public class contador extends funcionario{
    private int numCrc;

    public contador(String nome, String rg, double salario, int numCrc) {
        super(nome, rg, salario);
        this.numCrc = numCrc;
    }
    public int getNumCrc() {
        return numCrc;
    }
    public void setNumCrc(int numCrc) {
        this.numCrc = numCrc;
    }
}
