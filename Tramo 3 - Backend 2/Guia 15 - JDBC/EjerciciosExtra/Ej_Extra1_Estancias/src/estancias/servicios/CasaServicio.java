package estancias.servicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import estancias.entidades.Casa;
import estancias.persistencia.CasaDAO;

public class CasaServicio {

    private Scanner read = new Scanner(System.in);
    private CasaDAO dao;

    public CasaServicio(){
        dao = new CasaDAO();
    }

/////////////////////////////////////////////////////////////////////////////////
// calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda

// b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
// 2020 y el 31 de agosto de 2020 en Reino Unido.
    public void ejecutarListarCasasDisponibles(){
        try{

            // HARDCODEO ///////////
            Calendar calendar = Calendar.getInstance();
            calendar.set(2020, Calendar.AUGUST, 1);
            Date fechaDesde = calendar.getTime();
            calendar.set(2020, Calendar.AUGUST, 31);
            Date fechaHasta = calendar.getTime();
            String lugar = "Reino Unido";
            ////////////////////////

            Collection<Casa> casas = dao.listarCasasDisponiblesPorFechasEn(fechaDesde,fechaHasta,lugar);

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println("----------------------------------------------");
            System.out.println("Casas: (fechaDesde='2020-08-01', fechaHasta='2020-08-31', pais='Reino Unido')");
            for (Casa c: casas) {
                String fechaD = formatter.format(c.getFecha_desde());
                String fechaH = formatter.format(c.getFecha_hasta());
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("id_casa = "+c.getId_casa()+" || calle = "+c.getCalle()+" || numero = "+c.getNumero()+" || codigo_postal = "+c.getCodigo_postal()+" || ciudad = "+c.getCiudad()+" || pais = "+c.getPais()+" || \n" +
                "fecha_desde = "+fechaD+" || fecha_hasta = "+fechaH+" || tiempo_min = "+c.getTiempo_minimo()+" || tiempo_max = "+c.getTiempo_maximo()+" || precio_habitacion = $"+c.getPrecio_habitacion()+" || tipo_vivienda = "+c.getTipo_vivienda());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
// y un número de días específico.
    public void ejecutarListarCasasPorFechaYdias(){
        try{
            int dias;
            do{
                System.out.print("Cuantos dias quiere alquilar? (1-30) => ");
                dias = read.nextInt();
                read.nextLine();
            }while(dias>30 || dias<1);
            

            System.out.println("Ahora ingrese la fecha de disponibilidad:");
            System.out.print("Ingrese el anio => ");
            String aa = read.nextLine();
            System.out.print("Ingrese el mes => ");
            String mm = read.nextLine();
            System.out.print("Ingrese el dia  => ");
            String dd = read.nextLine();

            String fechaDesde = aa+"-"+mm+"-"+dd;

            Collection<Casa> casas = dao.listarCasasPorFechaYdias(fechaDesde,dias);

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println("----------------------------------------------");
            System.out.println("Casas: (fechaDesde >= '"+fechaDesde+"', tiempo_Min && tiempo_Max BETWEEN "+dias+")");
            
            if(casas.isEmpty()){
                System.out.println("No hay casas disponibles!");
            }else{
                for (Casa c: casas) {
                    String fechaD = formatter.format(c.getFecha_desde());
                    String fechaH = formatter.format(c.getFecha_hasta());
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("id_casa = "+c.getId_casa()+" || calle = "+c.getCalle()+" || numero = "+c.getNumero()+" || codigo_postal = "+c.getCodigo_postal()+" || ciudad = "+c.getCiudad()+" || pais = "+c.getPais()+" || \n" +
                    "fecha_desde = "+fechaD+" || fecha_hasta = "+fechaH+" || tiempo_min = "+c.getTiempo_minimo()+" || tiempo_max = "+c.getTiempo_maximo()+" || precio_habitacion = $"+c.getPrecio_habitacion()+" || tipo_vivienda = "+c.getTipo_vivienda());
                }
            }
            

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
// precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
// actualizados.
    public void ejecutarListarCasasReinoUnidoPrecioDevaluado(){
        try{
            
            Collection<Casa> casas = dao.listarCasasReinoUnidoPrecioDevaluado();

            System.out.println("----------------------------------------------");
            System.out.println("Casas: (pais = Reino Unido  || Devaluacion (precio * 1.05))");
            
            for (Casa c: casas) {
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("id_casa = "+c.getId_casa()+" || direccion = "+c.getCalle()+" "+c.getNumero()+" || codigo_postal = "+c.getCodigo_postal()+" || ubicacion = "+c.getPais()+" "+c.getCiudad()+" || \n" +
                "tiempo_min = "+c.getTiempo_minimo()+" || tiempo_max = "+c.getTiempo_maximo()+" || tipo_vivienda = "+c.getTipo_vivienda()+" || precio_habitacion = $"+c.getPrecio_habitacion());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// h) Obtener el número de casas que existen para cada uno de los países diferentes.
    public void ejecutarListarNumCasasPorPais(){
        try{
            
            HashMap<String,Integer> casasPorPais = dao.listarNumCasasPorPais();

            System.out.println("----------------------------------------------");
            System.out.println("Numero de casas por pais:");

            for (Map.Entry<String, Integer> entry : casasPorPais.entrySet()) {                
                System.out.println("---------------------------------------------------------------------------");
                String pais = entry.getKey();
                int cantidadCasas = entry.getValue();
                System.out.println("pais: "+ pais +" || cantidad de casas: "+ cantidadCasas);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
// que están ‘limpias’.
    public void ejecutarListarCasasReinoUnidoLimpias(){
        try{
            
            Collection<Casa> casas = dao.listarCasasReinoUnidoLimpias();

            System.out.println("----------------------------------------------");
            System.out.println("Casas: (comentario LIKE 'limpia')");

            for (Casa c: casas) {
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("id_casa = "+c.getId_casa()+" || tipo_vivienda = "+c.getTipo_vivienda()+" || precio_habitacion = $"+c.getPrecio_habitacion() +" || \n"+
                    "direccion = "+c.getCalle()+" "+c.getNumero()+" || ubicacion = "+c.getPais()+" "+c.getCiudad());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    

}
