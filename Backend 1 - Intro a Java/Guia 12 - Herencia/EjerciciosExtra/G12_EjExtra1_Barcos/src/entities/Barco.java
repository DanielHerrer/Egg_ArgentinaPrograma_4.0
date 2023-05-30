// Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

// En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
// sumándole el atributo particular de cada barco. 

package entities;

public class Barco {
    
    protected Integer matricula;
    protected int esloraMetros;
    protected int añoFabricacion;
    
    public Barco(){}

    public Barco(Integer matricula, int esloraMetros, int añoFabricacion) {
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.añoFabricacion = añoFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public int getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(int esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco [matricula=" + matricula + ", esloraMetros=" + esloraMetros + ", añoFabricacion=" + añoFabricacion
                + "]";
    }

}