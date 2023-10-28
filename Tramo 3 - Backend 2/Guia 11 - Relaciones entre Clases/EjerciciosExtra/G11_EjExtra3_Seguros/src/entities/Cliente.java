// A. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
//      cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
//        domicilio, teléfono.

package entities;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private int documento;
    private String mail;
    private String domicilio;
    private int telefono;

    public Cliente(){}

    public Cliente(String nombre, String apellido, int documento, String mail, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", mail=" + mail
                + ", domicilio=" + domicilio + ", telefono=" + telefono + "]";
    }
    
}
