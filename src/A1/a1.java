package A1;

// Classe abstrata - exemplo de abstração
abstract class Animal {
    // Atributos protegidos - encapsulamento
    protected String nome;
    protected int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;

        this.idade = idade;
    }

    // Métodos getters e setters - encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método concreto
    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }

    // Método abstrato - deve ser implementado pelas subclasses
    public abstract void emitirSom();

    // Método que pode ser sobrescrito
    public void mover() {
        System.out.println(nome + " está se movendo...");
    }
}

// Classe filha - exemplo de herança
class Cachorro extends Animal {
    private String raca;

    // Construtor
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da classe pai
        this.raca = raca;
    }

    // Getter e setter para o novo atributo
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Implementação do método abstrato - polimorfismo
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }

    // Sobrescrevendo método da classe pai - polimorfismo
    @Override
    public void mover() {
        System.out.println(nome + " está correndo!");
    }

    // Método específico da classe Cachorro
    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }
}

// Outra classe filha - exemplo de herança
class Gato extends Animal {
    private boolean temPedigree;

    public Gato(String nome, int idade, boolean temPedigree) {
        super(nome, idade);
        this.temPedigree = temPedigree;
    }

    public boolean isTemPedigree() {
        return temPedigree;
    }

    public void setTemPedigree(boolean temPedigree) {
        this.temPedigree = temPedigree;
    }

    // Implementação do método abstrato - polimorfismo
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }

    // Sobrescrevendo método da classe pai - polimorfismo
    @Override
    public void mover() {
        System.out.println(nome + " está caminhando silenciosamente!");
    }

    // Método específico da classe Gato
    public void ronronar() {
        System.out.println(nome + " está ronronando...");
    }
}

// Interface - exemplo de abstração total
interface Voador {
    void voar();
    void pousar();
}

// Classe que implementa interface
class Passaro extends Animal implements Voador {
    private double envergaduraAsas;

    public Passaro(String nome, int idade, double envergaduraAsas) {
        super(nome, idade);
        this.envergaduraAsas = envergaduraAsas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Piu piu!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando!");
    }

    // Implementação dos métodos da interface
    @Override
    public void voar() {
        System.out.println(nome + " levantou voo!");
    }

    @Override
    public void pousar() {
        System.out.println(nome + " pousou!");
    }
}

// Classe principal para demonstrar o uso
public class a1 {
    public static void main(String[] args) {
        // Criando objetos - instanciação
        Cachorro dog = new Cachorro("Rex", 3, "Golden Retriever");
        Gato cat = new Gato("Mimi", 2, true);
        Passaro bird = new Passaro("Canário", 1, 15.5);

        // Array de animais - polimorfismo
        Animal[] animais = {dog, cat, bird};

        // Demonstrando polimorfismo
        System.out.println("=== POLIMORFISMO ===");
        for (Animal animal : animais) {
            System.out.println("Animal: " + animal.getNome());
            animal.emitirSom(); // Cada animal emite som diferente
            animal.mover();     // Cada animal se move diferente
            animal.dormir();    // Método comum a todos
            System.out.println();
        }

        // Demonstrando métodos específicos
        System.out.println("=== MÉTODOS ESPECÍFICOS ===");
        dog.abanarRabo();
        cat.ronronar();
        bird.voar();
        bird.pousar();

        // Demonstrando encapsulamento
        System.out.println("\n=== ENCAPSULAMENTO ===");
        System.out.println("Idade do " + dog.getNome() + ": " + dog.getIdade());
        dog.setIdade(4); // Modificando através do setter
        System.out.println("Nova idade do " + dog.getNome() + ": " + dog.getIdade());

        // Demonstrando casting e instanceof
        System.out.println("\n=== CASTING E INSTANCEOF ===");
        if (bird instanceof Voador) {
            Voador voador = (Voador) bird;
            voador.voar();
        }
    }
}