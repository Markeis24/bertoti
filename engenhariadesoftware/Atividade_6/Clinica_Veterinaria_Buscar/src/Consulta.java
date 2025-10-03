public class Consulta {
    private String data;
    private String hora;
    private String motivo;
    private Animal animal;
    private Veterinario veterinario;

    public Consulta(String data, String hora, String motivo, Animal animal, Veterinario veterinario) {
        this.data = data;
        this.hora = hora;
        this.motivo = motivo;
        this.animal = animal;
        this.veterinario = veterinario;
    }

    public String realizar() {
        return "Consulta marcada para " + animal.getNome() +
                " com o veterinário " + veterinario.getNome() +
                " em " + data + " às " + hora +
                " | Motivo: " + motivo;
    }
}