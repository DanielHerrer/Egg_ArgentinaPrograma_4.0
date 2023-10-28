package estancias.servicios;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import estancias.entidades.Estancia;
import estancias.persistencia.CasaDAO;
import estancias.persistencia.EstanciaDAO;

public class EstanciaServicio {

    private Scanner read = new Scanner(System.in);
    private EstanciaDAO dao;

    public EstanciaServicio(){
        dao = new EstanciaDAO();
    }

    /////////////////////////////////////////////////////////////////////////////////

// e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
// descripcion de la casa donde la realizaron.
// public void ejecutarListarEstanciasConC(){
    // f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
    // ciudad del cliente y además la información de la casa que reservó. 
    // La que reemplazaría a la anterior
    public void ejecutarListarEstanciasConClientes(){
        try{
            Collection<Estancia> estancias = dao.listarEstanciasConClientes();

            System.out.println("----------------------------------------------");
            System.out.println("Estancias: (estancia / cliente / casa)");
            for (Estancia e: estancias) {
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("id_estancia = "+e.getId_estancia()+" || id_cliente = "+e.getCliente().getId_cliente()+" || nombre = "+e.getNombre_huesped()+" || ubicacion_Cliente = "+e.getCliente().getPais()+" / "+e.getCliente().getCiudad()+" \n" +
                "tipo_Casa = "+e.getCasa().getTipo_vivienda()+" || ubicacion_Casa = "+e.getCasa().getPais()+" / "+e.getCasa().getCiudad()+" || calle_Casa = "+e.getCasa().getCalle()+" "+e.getCasa().getNumero());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
    public void ejecutarGuardarEstancia(Cliente cliente) {
        try{

            System.out.println("Ahora ingrese la fecha de disponibilidad desde: ");
            System.out.print("Ingrese el anio => ");
            String aa = read.nextLine();
            System.out.print("Ingrese el mes => ");
            String mm = read.nextLine();
            System.out.print("Ingrese el dia  => ");
            String dd = read.nextLine();

            String fechaDesde = aa+"-"+mm+"-"+dd;
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            Date dateDesde = formatoFecha.parse(fechaDesde);

            int cantDias;
            do{
                System.out.print("Ingrese cantidad de dias para alojarse (1-30) => ");
                cantDias = read.nextInt();
                read.nextLine();
            }while(cantDias<1 || cantDias>30);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateDesde);
            calendar.add(Calendar.DAY_OF_MONTH, cantDias);  // le suma la cantidad de dias
            Date dateHasta = calendar.getTime();

            // La casa se puede elegir solo si esta dentro de la fecha de disponibilidad de alquiler
                // y que la casa no tenga una estancia registrada dentro de la fecha
            Collection<Casa> casas = new CasaDAO().listarCasasDisponiblesPorFechas(dateDesde, dateHasta, cantDias);
            
            if(casas.isEmpty()){
                System.out.println("-------------------------------------------------------------------------------------------------");
                throw new Exception("No hay ninguna casa disponible para la fecha que quiere alquilar!");
            }
            
            System.out.println("----------------------------------------------");
            System.out.println("Casas para elegir:");
            ArrayList<Integer> listaId = new ArrayList<>();
            for (Casa c: casas) {
                listaId.add(c.getId_casa());
                String fechaD = formatoFecha.format(c.getFecha_desde());
                String fechaH = formatoFecha.format(c.getFecha_hasta());
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("id_casa = "+c.getId_casa()+" || calle = "+c.getCalle()+" || numero = "+c.getNumero()+" || codigo_postal = "+c.getCodigo_postal()+" || ciudad = "+c.getCiudad()+" || pais = "+c.getPais()+" || \n" +
                    "fecha_desde = "+fechaD+" || fecha_hasta = "+fechaH+" || tiempo_min = "+c.getTiempo_minimo()+" || tiempo_max = "+c.getTiempo_maximo()+" || precio_habitacion = $"+c.getPrecio_habitacion()+" || tipo_vivienda = "+c.getTipo_vivienda());
            }

            int idCasaElegida = 0;
            do{
                System.out.print("Ingrese ID de la casa a elegir => ");
                idCasaElegida = read.nextInt();
                read.nextLine();
            }while(!listaId.contains(idCasaElegida));
            
            Casa casaElegida = new CasaDAO().buscarCasaPorId(idCasaElegida);

            Estancia estancia = new Estancia(cliente, casaElegida, cliente.getNombre(), dateDesde, dateHasta);
            dao.guardarEstancia(estancia);
            
            System.out.println("----------------------------------------------");
            System.out.println("Estancia registrada!");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
