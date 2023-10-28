package services;

import java.util.Scanner;
import entities.Asiento;
import entities.Cine;
import entities.Espectador;
import entities.Pelicula;
import enums.Ennumeracion.Columna;

public class CineService {

    private Scanner read = new Scanner(System.in);
    
    public Cine abrirCine(){
        EspectadorService es = new EspectadorService();
        PeliculaService ps = new PeliculaService();
        Asiento[][] sala = new Asiento[8][6];
        Pelicula pelicula = ps.crearPelicula();
        System.out.print("Ingrese el precio de la entrada => ");
        Float precioEntrada = read.nextFloat();
        int numEspectadores = (int) ((Math.random()*48)+1); // 1 a 48 espectadores
        System.out.println("Hay un total de "+numEspectadores+" personas haciendo fila para ver "+pelicula.getTitulo()+"!");
        for(int i=0; i<numEspectadores; i++){
            System.out.println("-----------------------------------------");
            Espectador espectador = es.crearEspectadorAuto();   // Se crea un espectador con valores aleatorios
            System.out.println("[Turno nº"+(i+1)+"] "+espectador.getNombre()+" | Edad:"+espectador.getEdad()+" | $"+ Math.round(espectador.getDinero() * 100.0f) / 100.0f);
            if(espectador.getDinero() >= precioEntrada && espectador.getEdad() >= pelicula.getEdadMin()){
                System.out.println("Entrada comprada con éxito!");
                espectador.setDinero(espectador.getDinero()-precioEntrada);
                int fila, columna;
                String columnaStr;
                do{
                    fila = (int) ((Math.random()*8));     // De 1 a 8 (filas)
                    columna = (int) ((Math.random()*6));    // De 0 a 5 (columnas)
                }while(sala[fila][columna] != null);    // Mientras que el asiento[fil][col] NO esté vacio
                columnaStr = Columna.getColumnaPorPosicion(columna); 
                sala[fila][columna] = new Asiento(columnaStr+String.valueOf(fila+1),espectador);  // concatena A + 1 
                System.out.println("Se le asignó el asiento "+columnaStr+String.valueOf(fila+1));
            }else if(espectador.getEdad() < pelicula.getEdadMin()){
                System.out.println("Venta falló, no cumple con la edad mínima requerida..");
            }else if(espectador.getDinero() < precioEntrada){
                System.out.println("Venta falló, dinero insuficiente..");
            }
        }
        return new Cine(pelicula,sala,precioEntrada);
    } 

    public void mostrarSala(Cine c){
        System.out.println("-----------------------------------------");
        System.out.println("Pelicula: "+c.getPelicula().getTitulo());
        System.out.println("Precio de entrada: $"+c.getPrecioEntrada());
        System.out.println("Asientos: (Disponibles="+c.getAsientosDisp()+") (Ocupados="+c.getAsientosOcup()+")");
        for(int i=7; i>=0; i--){
            for(int j=0; j<6; j++){
                if(c.getSala()[i][j] == null){
                    System.out.print(Columna.getColumnaPorPosicion(j)+(i+1)+"\u001B[32m _ \u001B[0m"+"|");
                }else{
                    System.out.print(Columna.getColumnaPorPosicion(j)+(i+1)+"\u001B[31m X \u001B[0m"+"|");
                }
            }
            System.out.println();
        }
    }

}
