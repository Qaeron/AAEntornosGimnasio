import java.util.Objects;

public class Entrenador {

    private String dni;
    private String nombre;
    private String apellido;
    private float salario;
    private char sexo;

    public Entrenador() {
    }

    public Entrenador(String dni, String nombre, String apellido, float salario, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
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
        Entrenador that = (Entrenador) o;
        return Float.compare(that.salario, salario) == 0 && sexo == that.sexo && Objects.equals(dni, that.dni) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }
}
