// De las películas nos interesa saber
// el título, duración, edad mínima y director. 

package entities;

public class Pelicula {
    
    private String titulo;
    private Integer duracionMinutos;
    private Integer edadMin;
    private String director;

    public Pelicula(){}

    public Pelicula(String titulo, int duracion, int edadMin, String director) {
        this.titulo = titulo;
        this.duracionMinutos = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracionMinutos;
    }

    public void setDuracion(int duracion) {
        this.duracionMinutos = duracion;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", duracionMinutos=" + duracionMinutos + ", edadMin=" + edadMin + ", director="
                + director + "]";
    }

}
