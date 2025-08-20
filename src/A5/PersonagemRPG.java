package A5;

public class PersonagemRPG {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;

    public PersonagemRPG(String nome, String classe, int nivel, int vida) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = 1;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) {
            this.nivel = 1;
        } else {
            this.nivel = nivel;
        }
    }

    public int getVida() {
        return vida;
    }



}
