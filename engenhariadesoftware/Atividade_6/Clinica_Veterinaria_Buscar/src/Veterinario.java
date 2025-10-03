public class Veterinario {
    private String nome;
    private String crmv;

    public Veterinario(String nome, String crmv) {
        this.nome = nome;
        this.crmv = crmv;
    }

    public String atender(Animal animal) {
        return "Veterinário " + nome + " está atendendo o animal " + animal.getNome();
    }

    public String getNome() { return nome; }
}