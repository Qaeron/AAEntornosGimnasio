import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EntrenadorTest {

    private String dni = "77777777X";
    private String nombre = "Carlos";
    private String apellido = "Moreno";
    private float salario = 1200.20f;
    private char sexo ='H';

    @Test
    public void dniTest() {
        Entrenador entrenador = new Entrenador(dni, nombre, apellido, salario, sexo);
        String dniEntrenador = entrenador.getDni();
        assertEquals("77777777X", dniEntrenador);
    }

    @Test
    public void nombreTest() {
        Entrenador entrenador = new Entrenador(dni, nombre, apellido, salario, sexo);
        String nombreEntrenador = entrenador.getNombre();
        assertEquals("Carlos", nombreEntrenador);
    }

    @Test
    public void apellidoTest() {
        Entrenador entrenador = new Entrenador(dni, nombre, apellido, salario, sexo);
        String apellidoEntrenador = entrenador.getApellido();
        assertEquals("Moreno", apellidoEntrenador);
    }

    @Test
    public void salarioTest() {
        Entrenador entrenador = new Entrenador(dni, nombre, apellido, salario, sexo);
        float salarioEntrenador = entrenador.getSalario();
        assertEquals(1200.20f, salarioEntrenador);
    }

    @Test
    public void sexoTest() {
        Entrenador entrenador = new Entrenador(dni, nombre, apellido, salario, sexo);
        char sexoEntrenador = entrenador.getSexo();
        assertEquals('H', sexoEntrenador);
    }
}
