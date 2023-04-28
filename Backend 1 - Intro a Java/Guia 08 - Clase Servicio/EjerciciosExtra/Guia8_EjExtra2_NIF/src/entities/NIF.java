package entities;

public class NIF {
    
    private int dni;
    private String nif;
    private String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public NIF() {
    }

    public NIF(int dni) {
        this.dni = dni;
        nif = letras[(dni % 23)];
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

}
