public class Veterinario {
    private String nome;
    private String crmv;
    private String especialidade;

    public Veterinario(String nome, String crmv, String especialidade) {
        this.nome = nome;
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    public void atender(Animal animal) {
        System.out.println("Veterinário " + nome + " está atendendo o animal " + animal.getNome());
    }

    // Getters
    public String getNome() {
        return nome;
    }
}