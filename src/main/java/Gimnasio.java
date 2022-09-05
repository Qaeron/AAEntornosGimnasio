import java.util.Objects;

public class Gimnasio {

    private String nombre;
    private String direccion;
    private int codigoPostal;
    private int numMaquinas;
    private char tienePiscina;

    public Gimnasio() {
    }

    public Gimnasio(String nombre, String direccion, int codigoPostal, int numMaquinas, char tienePiscina) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.numMaquinas = numMaquinas;
        this.tienePiscina = tienePiscina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getNumMaquinas() {
        return numMaquinas;
    }

    public void setNumMaquinas(int numMaquinas) {
        this.numMaquinas = numMaquinas;
    }

    public char getTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(char tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gimnasio gimnasio = (Gimnasio) o;
        return codigoPostal == gimnasio.codigoPostal && numMaquinas == gimnasio.numMaquinas && tienePiscina == gimnasio.tienePiscina && Objects.equals(nombre, gimnasio.nombre) && Objects.equals(direccion, gimnasio.direccion);
    }
}
