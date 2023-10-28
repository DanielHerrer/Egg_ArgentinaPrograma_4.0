/// EJERCICIO EXTRA 1
// Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
// Se deberá́ definir además dos constructores: uno vacío que inicializa el título 
// y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. 
// Se deberán además definir los métodos getters y setters correspondientes.

import entidadesCancion.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cancion c1 = new Cancion("8 mile","Eminem");
        c1.getTitulo();
        c1.getAutor();
    }
}
