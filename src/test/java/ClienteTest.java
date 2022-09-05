import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

    private String dni = "88888888A";
    private String nombre = "Maria";
    private String apellido = "Yuste";
    private float cuota = 34.70f;
    private char sexo = 'M';

    @Test
    public void dniCliente() {
        Cliente cliente = new Cliente(dni, nombre, apellido, cuota, sexo);
        String dniCliente = cliente.getDni();
        assertEquals("88888888A", dniCliente);
    }

    @Test
    public void nombreCliente() {
        Cliente cliente = new Cliente(dni, nombre, apellido, cuota, sexo);
        String nombreCliente = cliente.getNombre();
        assertEquals("Maria", nombreCliente);
    }

    @Test
    public void apellidoCliente() {
        Cliente cliente = new Cliente(dni, nombre, apellido, cuota, sexo);
        String apellidoCliente = cliente.getApellido();
        assertEquals("Yuste", apellidoCliente);
    }

    @Test
    public void cuotaCliente() {
        Cliente cliente = new Cliente(dni, nombre, apellido, cuota, sexo);
        float cuotaCliente = cliente.getCuota();
        assertEquals(34.70f, cuotaCliente);
    }

    @Test
    public void sexoCliente() {
        Cliente cliente = new Cliente(dni, nombre, apellido, cuota, sexo);
        char sexoCliente = cliente.getSexo();
        assertEquals('M', sexoCliente);
    }
}
