package estancias.entidades;

public class Cliente {
    
    private Integer id_cliente;
    private String nombre;
    private String calle;
    private int numeroCalle;
    private String codigo_postal;
    private String ciudad;
    private String pais;
    private String email;

    public Cliente(){}

    public Cliente(String nombre, String calle, int numero, String codigo_postal, String ciudad, String pais,
            String email) {
        this.nombre = nombre;
        this.calle = calle;
        this.numeroCalle = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numeroCalle;
    }

    public void setNumero(int numero) {
        this.numeroCalle = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}