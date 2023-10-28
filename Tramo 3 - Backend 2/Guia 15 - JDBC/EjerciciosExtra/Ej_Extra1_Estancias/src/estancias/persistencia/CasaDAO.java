package estancias.persistencia;

import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import estancias.entidades.Casa;

public final class CasaDAO extends DAO {
    
    // INSERT 
    public void guardarCasa(Casa c) throws Exception {

        try {
            if (c == null) {
                throw new Exception("Debe indicar una casa");
            }

            String sql = "INSERT INTO casas (calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda)"
                            + " VALUES ('"+c.getCalle()+"','"+c.getNumero()+"','"+c.getCodigo_postal()+"','"+c.getCiudad()+"','"+c.getPais()+"','"+c.getFecha_desde()+"','"+c.getFecha_hasta()+"','"+c.getTiempo_minimo()+"','"+c.getTiempo_maximo()+"','"+c.getPrecio_habitacion()+"','"+c.getTipo_vivienda()+"')";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        }
    }

    // UPDATE
    public void modificarCasa(Casa c) throws Exception {
        
        try {
            if (c == null) {
                throw new Exception("Debe indicar la casa que desea modificar");
            }

            String sql = "UPDATE casas SET "
                            + "calle='"+ c.getCalle() +"', numero='"+ c.getNumero() +"', codigo_postal='"+ c.getCodigo_postal() +"', ciudad='"+ c.getCiudad() +"', pais='"+ c.getPais() +"', fecha_desde='"+ c.getFecha_desde() +"', fecha_hasta='"+ c.getFecha_hasta() +"', tiempo_minimo='"+ c.getTiempo_minimo() +"', tiempo_maximo='"+ c.getTiempo_maximo() +"', precio_habitacion='"+ c.getPrecio_habitacion() +"', tipo_vivienda='"+ c.getTipo_vivienda() +"' WHERE id_casa='"+c.getId_casa() +"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    // DELETE
    public void eliminarCasaPorId(int id) throws Exception {
        try {
            String sql = "DELETE FROM casas WHERE id_casa='"+id+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            
            throw e;
        } finally {
            desconectarBase();
        }
    }

/////////////////////////////////////////////////////////////////////

    // calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda
    public Casa buscarCasaPorId(int id) throws Exception {
        try{
            String sql = "SELECT * FROM casas WHERE id_casa='"+id+"'";
            consultarBase(sql);

            Casa c = null;
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                c = new Casa();
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getInt(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getInt(11));
                c.setTipo_vivienda(resultado.getString(12));
            }

            return c;

        } catch(Exception e) {   
            throw e;

        } finally {
            desconectarBase();
        }
    }

    public Collection<Casa> listarTodasLasCasas() throws Exception {
        try{

            String sql = "SELECT * FROM casas";
            consultarBase(sql);

            Casa c = null;
            Collection<Casa> casas = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                c = new Casa();
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getInt(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getInt(11));
                c.setTipo_vivienda(resultado.getString(12));

                casas.add(c);
            }

            desconectarBase();
            return casas;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

// b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
// 2020 y el 31 de agosto de 2020 en Reino Unido.
    public Collection<Casa> listarCasasDisponiblesPorFechasEn(Date desde, Date hasta, String lugar) throws Exception {
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDesde = formatter.format(desde);
            String fechaHasta = formatter.format(hasta);

            String sql = "SELECT * FROM casas WHERE fecha_desde >= '"+fechaDesde+"' AND fecha_hasta <= '"+fechaHasta+"' AND pais LIKE '%"+lugar+"%'";
            consultarBase(sql);

            Casa c = null;
            Collection<Casa> casas = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                c = new Casa();
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getInt(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getInt(11));
                c.setTipo_vivienda(resultado.getString(12));

                casas.add(c);
            }

            desconectarBase();
            return casas;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

// d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
// y un número de días específico.
    public Collection<Casa> listarCasasPorFechaYdias(String fecha, int dias) throws Exception {
        try{

            String sql = "SELECT * FROM casas WHERE (fecha_desde >= '"+fecha+"') AND ("+dias+" BETWEEN tiempo_minimo AND tiempo_maximo)";
            consultarBase(sql);

            Casa c = null;
            Collection<Casa> casas = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                c = new Casa();
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getInt(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getInt(11));
                c.setTipo_vivienda(resultado.getString(12));

                casas.add(c);
            }

            desconectarBase();
            return casas;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

// g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
// precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
// actualizados.
    public void devaluarPrecioCasa(int id) throws Exception {
        try{

            String sql = "UPDATE casas SET precio_habitacion = precio_habitacion * 1.05 WHERE id_casa = "+id;
            insertUpdateDelete(sql);

        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("Error del sistema");
        }
    }
    // Recibe casas del reino unido y les actualiza un 5% el precio a cada casa, luego devuelve la lista
    public Collection<Casa> listarCasasReinoUnidoPrecioDevaluado() throws Exception {
        try{

            String sql = "SELECT * FROM casas WHERE pais = 'Reino Unido'";
            consultarBase(sql);

            Casa c = null;
            Collection<Casa> casas = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                c = new Casa();
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getInt(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getInt(11));
                c.setTipo_vivienda(resultado.getString(12));

                casas.add(c);
            }

            // actualiza los precios de cada casa que se registro de Reino Unido
            for(Casa casa: casas){
                devaluarPrecioCasa(casa.getId_casa());
            }

            desconectarBase();
            return casas;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

// h) Obtener el número de casas que existen para cada uno de los países diferentes.
    public HashMap<String, Integer> listarNumCasasPorPais() throws Exception {
        try{

            String sql = "SELECT pais, COUNT(id_casa) FROM casas GROUP BY pais";
            consultarBase(sql);

            HashMap<String, Integer> casasPorPais = new HashMap<>();

            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                
                casasPorPais.put(resultado.getString(1), resultado.getInt(2));
            }

            desconectarBase();
            return casasPorPais;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

// i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
// que están ‘limpias’.
    public Collection<Casa> listarCasasReinoUnidoLimpias() throws Exception {
        try{

            String sql = "SELECT * FROM casas cas INNER JOIN comentarios com ON cas.id_casa = com.id_casa WHERE cas.pais = 'Reino Unido' AND com.comentario LIKE '%limpia%' GROUP BY cas.id_casa";
            consultarBase(sql);

            Casa c = null;
            Collection<Casa> casas = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                c = new Casa();
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getInt(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getInt(11));
                c.setTipo_vivienda(resultado.getString(12));

                casas.add(c);
            }

            desconectarBase();
            return casas;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

    // j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
    public Collection<Casa> listarCasasDisponiblesPorFechas(Date fechaDesde, Date fechaHasta, int dias) throws Exception {
        try{

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechaD = formato.format(fechaDesde);
            String fechaH = formato.format(fechaHasta);

            String sql = "SELECT cas.* FROM casas cas " + 
                    "INNER JOIN estancias est ON cas.id_casa = est.id_casa " + 
                    "WHERE (cas.fecha_desde <= '"+fechaD+"') " + 
                    "AND (cas.fecha_hasta >= '"+fechaH+"') " + 
                    "AND ('"+fechaD+"' NOT BETWEEN est.fecha_desde AND est.fecha_hasta) " + 
                    "AND ('"+fechaH+"' NOT BETWEEN est.fecha_desde AND est.fecha_hasta) " + 
                    "AND ('"+dias+"' >= cas.tiempo_minimo) AND ('"+dias+"' <= cas.tiempo_maximo) GROUP BY cas.id_casa";
            consultarBase(sql);

            Casa c = null;
            Collection<Casa> casas = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                c = new Casa();
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getInt(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getInt(11));
                c.setTipo_vivienda(resultado.getString(12));

                casas.add(c);
            }

            desconectarBase();
            return casas;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

}