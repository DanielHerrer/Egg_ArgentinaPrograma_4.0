// • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
// incorporación a la facultad y qué número de despacho tienen asignado.

package entities;

public class Empleado extends Persona {

    private int añoIncorporacion;
    private int numeroDeDespacho;
    
    public Empleado(){}

    public Empleado(String nombre, String apellido, String estadoCivil, int añoIncorporacion,
            int numeroDeDespacho) {
        super(nombre, apellido, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeroDeDespacho = numeroDeDespacho;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(int añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }

    public int getNumeroDeDespacho() {
        return numeroDeDespacho;
    }

    public void setNumeroDeDespacho(int numeroDeDespacho) {
        this.numeroDeDespacho = numeroDeDespacho;
    }

}
