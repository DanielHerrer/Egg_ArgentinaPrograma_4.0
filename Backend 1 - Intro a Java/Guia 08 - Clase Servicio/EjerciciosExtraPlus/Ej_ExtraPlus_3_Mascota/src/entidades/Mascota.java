package entidades;
public class Mascota {

    private String nombre, raza, tipo;
    private int edad;

    public Mascota(){}

    public Mascota(String nombre, String raza, String tipo, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota [Nombre=" + nombre + ", Raza=" + raza + ", Tipo=" + tipo + ", Edad=" + edad + "]";
    }
    
}