// • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
// pertenecen (lenguajes, matemáticas, arquitectura, ...).

package entities;

public class Profesor extends Empleado {

    private String departamento;

    public Profesor(){}

    public Profesor(String nombre, String apellido, String estadoCivil, int añoIncorporacion,
            int numeroDeDespacho, String departamento) {
        super(nombre, apellido, estadoCivil, añoIncorporacion, numeroDeDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}