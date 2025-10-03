public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String cadastrar() {
        return "Animal cadastrado: " + nome + " (" + especie + ", " + idade + " anos)";
    }

    public String getNome() { return nome; }
}
