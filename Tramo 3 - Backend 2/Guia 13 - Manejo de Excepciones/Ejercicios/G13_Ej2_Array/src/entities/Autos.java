package entities;

public class Autos {
    
    private String[] marcaAutos;

    public Autos() {
        marcaAutos = new String[4];
    }

    public Autos(String[] marcaAutos) {
        this.marcaAutos = marcaAutos;
    }

    public void setMarcaAutos(String[] marcaAutos) {
        this.marcaAutos = marcaAutos;
    }

    public String[] getMarcaAutos() {
        return marcaAutos;
    }

}