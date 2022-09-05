import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GimnasioTest {

    private String nombre = "Gimnasio 1";
    private String direccion = "Avenida Goya 16";
    private int codigoPostal = 50005;
    private int numMaquinas = 140;
    private char tienePiscina = 'n';

    @Test
    public void nombreTest() {
        Gimnasio gimnasio = new Gimnasio(nombre, direccion, codigoPostal, numMaquinas, tienePiscina);
        String nombreGimnasio = gimnasio.getNombre();
        assertEquals("Gimnasio 1", nombreGimnasio);
    }

    @Test
    public void direccionTest() {
        Gimnasio gimnasio = new Gimnasio(nombre, direccion, codigoPostal, numMaquinas, tienePiscina);
        String direccionGimnasio = gimnasio.getDireccion();
        assertEquals("Avenida Goya 16", direccionGimnasio);
    }

    @Test
    public void codigoPostalTest() {
        Gimnasio gimnasio = new Gimnasio(nombre, direccion, codigoPostal, numMaquinas, tienePiscina);
        int codigoPostalGimnasio = gimnasio.getCodigoPostal();
        assertEquals(50005, codigoPostalGimnasio);
    }

    @Test
    public void numMaquinasTest() {
        Gimnasio gimnasio = new Gimnasio(nombre, direccion, codigoPostal, numMaquinas, tienePiscina);
        int numMaquinasGimnasio = gimnasio.getNumMaquinas();
        assertEquals(140, numMaquinasGimnasio);
    }

    @Test
    public void tienePiscinaTest() {
        Gimnasio gimnasio = new Gimnasio(nombre, direccion, codigoPostal, numMaquinas, tienePiscina);
        char tienePiscinaGimnasio = gimnasio.getTienePiscina();
        assertEquals('n', tienePiscinaGimnasio);
    }
}
