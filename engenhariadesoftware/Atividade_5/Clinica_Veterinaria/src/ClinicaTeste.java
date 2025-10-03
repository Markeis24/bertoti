import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Date;

public class ClinicaTeste {

    @Test
    public void testCadastroAnimal() {
        Animal animal = new Animal("Rex", "Cachorro", 5);
        assertEquals("Rex", animal.getNome());
        assertEquals("Cachorro", animal.getEspecie());
        assertEquals(5, animal.getIdade());
    }

    @Test
    public void testAtendimentoVeterinario() {
        Animal animal = new Animal("Mimi", "Gato", 3);
        Veterinario vet = new Veterinario("Dra. Ana", "CRMV5678", "Felinos");

        assertEquals("Dra. Ana", vet.getNome());

        vet.atender(animal);
    }

    @Test
    public void testConsulta() {
        Animal animal = new Animal("Thor", "Cachorro", 2);
        Veterinario vet = new Veterinario("Dr. Paulo", "CRMV9999", "Ortopedia");
        Consulta consulta = new Consulta(new Date(), "10:00", "Check-up", animal, vet);

        assertNotNull(consulta);
    }
}
