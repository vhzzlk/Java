package A14;

// Classe abstrata que serve como um modelo base para diferentes tipos de usuários
// Não pode ser instanciada diretamente - deve ser estendida por classes concretas
public abstract class Usuario {
    // Atributos privados demonstram encapsulamento - ocultação de dados
    // Só podem ser acessados através de métodos públicos getter/setter
    private String nome;
    private String email;
    private int id;

    // Construtor para inicialização do objeto
    // Demonstra encapsulamento controlando como os objetos são criados
    public Usuario(String nome, String email, int id) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método abstrato que deve ser implementado pelas classes filhas
    // Demonstra polimorfismo - implementações diferentes em classes diferentes
    public abstract int getLimiteEmprestimo();

    @Override
    public String toString() {
        return "id :" + id + " | nome :" + nome + " | email :" + email;
    }
}