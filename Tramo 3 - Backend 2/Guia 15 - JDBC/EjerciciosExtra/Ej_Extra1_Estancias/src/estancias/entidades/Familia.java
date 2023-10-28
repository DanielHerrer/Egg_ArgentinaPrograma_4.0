package estancias.entidades;

public class Familia {
    
    private Integer id_familia;
    private String nombre;
    private int edad_minima, edad_maxima;
    private int num_hijos;
    private String email;
    private Casa id_casa_familia;

    public Familia(){}

    public Familia(String nombre, int edad_minima, int edad_maxima, int num_hijos, String email, Casa id_casa_familia) {
        this.nombre = nombre;
        this.edad_minima = edad_minima;
        this.edad_maxima = edad_maxima;
        this.num_hijos = num_hijos;
        this.email = email;
        this.id_casa_familia = id_casa_familia;
    }

    public Integer getId_familia() {
        return id_familia;
    }

    public void setId_familia(Integer id_familia) {
        this.id_familia = id_familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public int getEdad_maxima() {
        return edad_maxima;
    }

    public void setEdad_maxima(int edad_maxima) {
        this.edad_maxima = edad_maxima;
    }

    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Casa getCasa_familia() {
        return id_casa_familia;
    }

    public void setCasa_familia(Casa id_casa_familia) {
        this.id_casa_familia = id_casa_familia;
    }

}
