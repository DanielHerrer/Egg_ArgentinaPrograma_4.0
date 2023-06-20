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
    // CAMINAR = (BOTAS x1 x1) (x2) = 60km x hr | 1km x min
            // BOTA 30km x hr | 0,5km x min
    // CORRER = (BOTAS: x2 x2) (x4) = 120km x hr | 2km x min
            // BOTA 60km x hr | 1km x min
    // PROPULSARSE = (BOTAS: x3 x3) (x6) = 180km x hr | 3km x min 
            // BOTA 90km x hr | 1.5km x min
    // VOLAR = (ambos guantes y botas) 300km por hora | 5km por minuto 
            // GUANTES 120km x hr [2km x min] | BOTAS 180km x hr [3km x min]
            // GUANTE 60km x hr [1km x min] + BOTA 90km x hr [1.5km x min] = 2.5km x min
    private int x,y,z;

    private Objetivo[][][] mapaCompleto;

    public Radar(){
        x = 25;
        y = 25;
        z = 0;
        mapaCompleto = new Objetivo[50][50][50];
    }

    public Radar(Objetivo[][][] mapaCompleto) {
        this.mapaCompleto = mapaCompleto;
        x = 24;
        y = 24;
        z = 0;
    }

    public Radar(int x, int y, int z, Objetivo[][][] mapaCompleto) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.mapaCompleto = mapaCompleto;
    }

    public String vista(){
        String vista = "";
        int xView = this.x - 5;
        int yView = this.y - 5;
        int zView = this.z;
        for(int yi = 0; yi<11; yi++){
            for(int xi = 0; xi<11; xi++){
                try{
                    if(yi==5 && xi==5){
                        vista += "\u001B[36m[O]\u001B[0m"; // el centro del radar
                    }else if(mapaCompleto[xView][yView][zView] == null){
                        vista += "[ ]"; // si no hay nada
                    }else if(mapaCompleto[xView][yView][zView].isHostil()){
                        vista += "[\u001B[31mX\u001B[0m]"; // "X" si es enemigo
                    }else if(!mapaCompleto[xView][yView][zView].isHostil()){
                        vista += "[\u001B[32m#\u001B[0m]"; // "#" si es aliado
                    }
                }catch(IndexOutOfBoundsException e){
                    vista += "[\u001B[33m-\u001B[0m]"; // "-" si es fuera del mapa
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

    public void setPosiciones(int[] posiciones){
        this.x = posiciones[0];
        this.y = posiciones[1];
        this.z = posiciones[2];
    }

    public boolean posicionOcupada(int xP, int yP, int zP){
        if(mapaCompleto[xP][yP][zP] == null){
            return false;
        }else if(mapaCompleto[xP][yP][zP] != null){
            return true;
        }else{
            return false;
        }
    }

    public boolean posicionOcupada(int posiciones[]){
        int xP = posiciones[0];
        int yP = posiciones[1];
        int zP = posiciones[2];
        if(mapaCompleto[xP][yP][zP] == null){
            return false;
        }else if(mapaCompleto[xP][yP][zP] != null){
            return true;
        }else{
            return false;
        }
    }

    public void insertarObjetivo(Objetivo obj){
        int Xi = obj.getX();
        int Yi = obj.getY();
        int Zi = obj.getZ();
        this.mapaCompleto[Xi][Yi][Zi] = obj;
    }

    public void eliminarObjetivo(Objetivo obj){
        int Xi = obj.getX();
        int Yi = obj.getY();
        int Zi = obj.getZ();
        this.mapaCompleto[Xi][Yi][Zi] = null;
    }

    public void limpiarMapa(){
        for (int i = 0; i < mapaCompleto.length; i++) {
            for (int j = 0; j < mapaCompleto[i].length; j++) {
                for (int k = 0; k < mapaCompleto[i][j].length; k++) {
                    mapaCompleto[i][j][k] = null;
                }
            }
        }
    } 

    public int getCantObjetivosHostiles(){
        int cantHostiles = 0;
        for(int i = 0; i<mapaCompleto.length; i++){
            for(int j = 0; j<mapaCompleto[i].length; j++){
                for(int k = 0; k<mapaCompleto[j].length; k++){
                    if(mapaCompleto[i][j][k] instanceof Objetivo){
                        if(mapaCompleto[i][j][k].isHostil()){
                            cantHostiles++;
                        }
                    }
                } 
            }
        }
        return cantHostiles;
    }

    public String getListaObjetivosHostiles(){
        String listaHostiles = "";
        for(int i = 0; i<mapaCompleto.length; i++){
            for(int j = 0; j<mapaCompleto[i].length; j++){
                for(int k = 0; k<mapaCompleto[j].length; k++){
                    if(mapaCompleto[i][j][k] instanceof Objetivo){
                        if(mapaCompleto[i][j][k].isHostil()){
                            listaHostiles += "OBJETIVO (HOSTIL): [RESISTENCIA="+mapaCompleto[i][j][k].getResistencia()+"] [X="+i+" / Y="+j+" / Z="+k+"]\n";
                        }
                    }
                } 
            }
        }
        return listaHostiles;
    }

    public String getListaObjetivosAliados(){
        String listaAliados = "";
        for(int i = 0; i<mapaCompleto.length; i++){
            for(int j = 0; j<mapaCompleto[i].length; j++){
                for(int k = 0; k<mapaCompleto[j].length; k++){
                    if(mapaCompleto[i][j][k] instanceof Objetivo){
                        if(!mapaCompleto[i][j][k].isHostil()){
                            listaAliados += "OBJETIVO (ALIADO): [X="+i+" / Y="+j+" / Z="+k+"]\n";
                        }
                    }
                } 
            }
        }
        return listaAliados;
    }

    public int getCantObjetivosAliados(){
        int cantAliados = 0;
        for(int i = 0; i<mapaCompleto.length; i++){
            for(int j = 0; j<mapaCompleto[i].length; j++){
                for(int k = 0; k<mapaCompleto[j].length; k++){
                    if(mapaCompleto[i][j][k] instanceof Objetivo){
                        if(!mapaCompleto[i][j][k].isHostil()){
                            cantAliados++;
                        }
                    }
                } 
            }
        }
        return cantAliados;
    }

    public Objetivo[][][] getMapaCompleto() {
        return mapaCompleto;
    }

    public void setMapaCompleto(Objetivo[][][] mapaCompleto) {
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
