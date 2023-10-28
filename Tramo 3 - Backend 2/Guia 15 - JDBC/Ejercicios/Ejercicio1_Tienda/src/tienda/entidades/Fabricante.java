package tienda.entidades;

public class Fabricante {
    
    private Integer codigo;
    private String nombre;
    
    public Fabricante() {}

    public Fabricante(String nombre) {
        this.nombre = nombre;
    }

    public Fabricante(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}