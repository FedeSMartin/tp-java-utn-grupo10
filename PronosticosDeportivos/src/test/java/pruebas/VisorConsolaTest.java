package pruebas;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import controller.Participante;
import view.VisorConsola;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class VisorConsolaTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testMostrarResultados() {
        List<Participante> participantes = new ArrayList<>();
        participantes.add(new Participante("Jugador1", 10, 5));
        participantes.add(new Participante("Jugador2", 8, 4));

        VisorConsola.mostrarResultados(participantes);

        // Verificar que la salida en la consola es la esperada
        String expectedOutput = "Jugador1, tiene 10 puntos, acertó 5 pronósticos.\n" +
                                "Jugador2, tiene 8 puntos, acertó 4 pronósticos.\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    // Puedes agregar más pruebas según sea necesario para cubrir otros métodos y casos de borde.
}

