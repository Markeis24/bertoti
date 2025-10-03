import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClinicaTesteBuscar {

    @Test
    public void testCadastroAnimal() {
        Animal animal = new Animal("Rex", "Cachorro", 5);
        String resultado = animal.cadastrar();
        System.out.println(resultado);
        assertEquals("Animal cadastrado: Rex (Cachorro, 5 anos)", resultado);
    }

    @Test
    public void testAtendimentoVeterinario() {
        Animal animal = new Animal("Mimi", "Gato", 3);
        Veterinario vet = new Veterinario("Dra. Ana", "CRMV5678");
        String resultado = vet.atender(animal);
        System.out.println(resultado);
        assertEquals("Veterinário Dra. Ana está atendendo o animal Mimi", resultado);
    }

    @Test
    public void testConsulta() {
        Animal animal = new Animal("Thor", "Cachorro", 2);
        Veterinario vet = new Veterinario("Dr. Paulo", "CRMV9999");
        Consulta consulta = new Consulta("01/10/2025", "10:00", "Check-up", animal, vet);

        String resultado = consulta.realizar();
        System.out.println(resultado);

        String esperado = "Consulta marcada para Thor com o veterinário Dr. Paulo em 01/10/2025 às 10:00 | Motivo: Check-up";
        assertEquals(esperado, resultado);
    }
}