// Radar Versión 1.0
// JARVIS posee también incorporado un sistema que usa ondas electromagnéticas para medir
// distancias, altitudes, ubicaciones de objetos estáticos o móviles como aeronaves barcos,
// vehículos motorizados, formaciones meteorológicas y por su puesto enemigos de otro planeta.
// Su funcionamiento se basa en emitir un impulso de radio, que se refleja en el objetivo y se recibe
// típicamente en la misma posición del emisor.

// Las ubicaciones de los objetos están dadas por las coordenadas (X, Y y Z). 

// Los objetos pueden ser marcados o no como hostiles. 

// JARVIS también puede detectar la resistencia del objeto, 
// y puede detectar hasta 10 objetos de manera simultánea.

// JARVIS puede calcular la distancia a la que se encuentra cada uno de los objetos, 
// para esto siempre considera que la armadura se encuentra situada en la coordenada (0,0,0).

// Hacer un método que informen a qué distancia se encuentra cada uno de los enemigos. 
// Usar la clase Math de Java.

// Simulador
// Hacer un método en JARVIS que agregue en radar objetos, hacer que la resistencia, las
// coordenadas y la hostilidad sean aleatorios utilizando la clase random. Utilizar la clase Random.
    // -- ¿Qué ocurre si quiero añadir más de 10 objetos?
    // -- ¿Qué ocurre si cuando llevo 8 enemigos aumento la capacidad del vector?

// Destruyendo Enemigos
// Desarrollar un método para que JARVIS que analice todos los objetos del radar y si son hostiles
// que les dispare. El alcance de los guantes es de 5000 metros, si el objeto se encuentra fuera de
// ese rango no dispara.
// JARVIS al detectar un enemigo lo atacará hasta destruirlo, la potencia del disparo es inversamente
// proporcional a la distancia al a que se encuentra el enemigo y se descontará de la resistencia del
// enemigo. El enemigo se considera destruido si su resistencia es menor o igual a cero.
// JARVIS solo podrá disparar si el dispositivo está sano y si su nivel de batería lo permite. Si tiene
// los dos guantes sanos podrá disparar con ambos guantes haciendo más daño. Resolver utilizando
// un for each para recorrer el arreglo y un while para destruir al enemigo.

// Acciones Evasivas
// Desarrollamos un método para que JARVIS que analice todos los objetos del radar y si son
// hostiles que les dispare. Modificar ese método para que si el nivel de batería es menor al 10% se
// corten los ataques y se vuelve lo suficientemente lejos para que el enemigo no nos ataque.
// Deberíamos alejarnos por lo menos 10 km enemigo. 
// Tener en cuenta que la velocidad de vuelo promedio es de 300 km / hora.

package entities.radar;

public class Radar {

    // EVASION (alejarse 10km del enemigo)
    // CAMINAR = (BOTAS x1 x1) (x2) = 60 km x hr | 1km x min
    // CORRER = (BOTAS: x2 x2) (x4) = 120km x hr | 2km x min
    // PROPULSARSE = (BOTAS: x3 x3) (x6) = 180km x hr | 3km x min 
    // VOLAR = 300km por hora , 5km por minuto // (GUANTES: x2 x2) (x4) 120km x hr | (BOTAS: x3 x3) (x6) = 180km x hr
    private int x,y,z;
    private int[][][] campoVision;
    private int[][][] mapaCompleto;

    public Radar(){
        x = 50;
        y = 50;
        z = 0;
        campoVision = new int[11][11][11];
        mapaCompleto = new int[100][100][100];
    }

    public Radar(int[][][] campoVision, int[][][] mapaCompleto) {
        this.campoVision = campoVision;
        this.mapaCompleto = mapaCompleto;
    }

    public Radar(int x, int y, int z, int[][][] campoVision, int[][][] mapaCompleto) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.campoVision = campoVision;
        this.mapaCompleto = mapaCompleto;
    }

    public String vista(){
        String vista = "";
        int xView = this.x - 5;
        int yView = this.y - 5;
        int zView = this.z;
        for(int yi = 0; yi<campoVision.length; yi++){
            for(int xi = 0; xi<campoVision[yi].length; xi++){
                try{
                    if(mapaCompleto[xView][yView][zView] == 0){
                        vista += "[ ]";
                    }else if(mapaCompleto[xView][yView][zView] == 1){
                        vista += "[#]";
                    }else if(mapaCompleto[xView][yView][zView] == 2){
                        vista += "[X]";
                    }
                }catch(IndexOutOfBoundsException e){
                    vista += "[-]";
                }finally{
                    xView ++;
                }
            }
            xView -= 11;
            yView ++;
            vista += "\n";
        }
        return vista;
    }

    public int[] getPosiciones(){
        int[] posiciones = new int[3];
        posiciones[0] = this.x;
        posiciones[1] = this.y;
        posiciones[2] = this.z;
        return posiciones;
    }

    public int[][][] getCampoVision() {
        return campoVision;
    }

    public void setCampoVision(int[][][] campoVision) {
        this.campoVision = campoVision;
    }

    public int[][][] getMapaCompleto() {
        return mapaCompleto;
    }

    public void setMapaCompleto(int[][][] mapaCompleto) {
        this.mapaCompleto = mapaCompleto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

}
