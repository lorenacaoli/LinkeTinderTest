import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void cadastrar() {
        List<Empresa> listaEmpresas = new ArrayList<Empresa>();
        List<String> competencias = Arrays.asList("Groovy", "Java");
        Empresa empresa = Empresa.novo("Sorveteria Mágica", "sorveteriamagica@gmail.com","0001456", "Brasil", "Goiás", "74680700", "Sorveteria Italiana", competencias);

        listaEmpresas = Empresa.cadastrar(listaEmpresas, empresa);
        List<Empresa> finalListaEmpresas = listaEmpresas;

        assertAll(() -> assertEquals(1, finalListaEmpresas.size()),
                () -> assertEquals("Sorveteria Mágica", finalListaEmpresas.get(0).getNome()));
    }
}