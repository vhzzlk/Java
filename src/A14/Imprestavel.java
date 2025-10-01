package A14;

// Interface: Um contrato que define comportamentos que uma classe deve implementar
// É um conceito fundamental de Orientação a Objetos que permite abstração e polimorfismo
public interface Imprestavel {
    // Método que define o comportamento de emprestar algo para um usuário
    // Demonstra o encapsulamento ao esconder a implementação
    public void emprestar(Usuario usuario);

    // Método que define o comportamento de devolver algo
    // Parte do contrato que as classes implementadoras devem seguir
    public void devolver();
}
