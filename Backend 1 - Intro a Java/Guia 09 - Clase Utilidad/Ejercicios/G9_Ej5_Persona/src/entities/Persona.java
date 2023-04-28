// Implemente la clase Persona en el paquete entidades. 
// Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
// constructor vacío, constructor parametrizado, get y set. 

package entities;
import java.util.Date;

public class Persona{

    String nombre;
    Date fechaNac;
    
    public Persona(){
        nombre = "";
        fechaNac = new Date();
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}