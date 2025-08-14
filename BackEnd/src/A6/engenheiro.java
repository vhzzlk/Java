package A6;

public class engenheiro extends funcionario{

    private String NumCrea;


    public engenheiro(String nome, String rg, double salario, String NumCrea) {
        super(nome, rg, salario);
        this.NumCrea = NumCrea;
    }
    public String getNumCrea() {
        return NumCrea;
    }
    public void setNumCrea(String NumCrea) {

    }
}
