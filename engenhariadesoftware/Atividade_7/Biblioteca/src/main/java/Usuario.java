public class Usuario {
    private String nome;
    private String ra;

    public Usuario(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
