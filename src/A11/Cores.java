package A11;

public enum Cores {
    VERMELHO (10),
    AZUL (20),
    VERDE (30),
    MARROM (40),
    PRETO (50),
    BRANCO (60);

    private int i;
    Cores(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
}
