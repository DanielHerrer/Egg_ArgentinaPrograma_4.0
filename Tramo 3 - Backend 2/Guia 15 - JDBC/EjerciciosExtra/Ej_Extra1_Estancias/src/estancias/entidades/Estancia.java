package estancias.entidades;

import java.util.Date;

public class Estancia {
    
    private Integer id_estancia;
    private Cliente id_cliente;
    private Casa id_casa;
    private String nombre_huesped;
    private Date fecha_desde, fecha_hasta;

    public Estancia(){}

    public Estancia(Cliente id_cliente, Casa id_casa, String nombre_huesped, Date fecha_desde, Date fecha_hasta) {
        this.id_cliente = id_cliente;
        this.id_casa = id_casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public Integer getId_estancia() {
        return id_estancia;
    }

    public void setId_estancia(Integer id_estancia) {
        this.id_estancia = id_estancia;
    }

    public Cliente getCliente() {
        return id_cliente;
    }

    public void setCliente(Cliente cliente) {
        this.id_cliente = cliente;
    }

    public Casa getCasa() {
        return id_casa;
    }

    public void setCasa(Casa casa) {
        this.id_casa = casa;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

}