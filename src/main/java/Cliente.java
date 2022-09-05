import java.util.Objects;

public class Cliente {

    private String dni;
    private String nombre;
    private String apellido;
    private float cuota;
    private char sexo;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellido, float cuota, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuota = cuota;
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Float.compare(cliente.cuota, cuota) == 0 && Objects.equals(dni, cliente.dni) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido) && Objects.equals(sexo, cliente.sexo);
    }
}
