package pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import controller.Partido;
import model.InfoBDPartido;

import java.util.List;

class InfoBDPartidoTest {

    @Test
    void testObtenerDatosPartidos() {
        InfoBDPartido infoBDPartido = new InfoBDPartido();
        List<Partido> listaDePartidos = infoBDPartido.obtenerDatosPartidos();

        // Verificar que la lista no sea nula
        assertNotNull(listaDePartidos);

        // Verificar que la lista no esté vacía
        assertFalse(listaDePartidos.isEmpty());


    }


}

