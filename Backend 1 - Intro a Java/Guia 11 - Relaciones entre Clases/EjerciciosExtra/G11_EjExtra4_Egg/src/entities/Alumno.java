// El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
// nombre completo, DNI y cantidad de votos. 

package entities;

public class Alumno {

    private String nombreCompleto;
    private Integer dni;
    private Integer votos;

    

    public Alumno(String nombreCompleto, Integer dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votos = 0;
    }

    public Alumno(String nombreCompleto, Integer dni, Integer votos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votos = votos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno [nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", votos=" + votos + "]";
    }

}