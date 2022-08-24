import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoTest {


    @Test
    void cadastrar() {
        List<Candidato> listaCandidatos = new ArrayList<Candidato>();
        List<String> competencias = Arrays.asList("Groovy", "Java");
        Candidato candidato = Candidato.novo("Joana Darc", "04498096277", 22, "joaninhadarc@gmail.com","Goiás", "74682070", "Procurando primeiro emprego", competencias);

        listaCandidatos = Candidato.cadastrar(listaCandidatos, candidato);
        List<Candidato> finallistaCandidatos = listaCandidatos;

        assertAll(() -> assertEquals(1, finallistaCandidatos.size()),
                () -> assertEquals("Joana Darc", finallistaCandidatos.get(0).getNome()));
    }
}