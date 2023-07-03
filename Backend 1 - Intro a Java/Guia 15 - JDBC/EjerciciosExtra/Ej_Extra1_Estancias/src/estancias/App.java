// Realizar un menú en java a través del cual se permita elegir qué consulta se desea realizar.
// Las consultas a realizar sobre la BD son las siguientes:

// a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
// b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
// 2020 y el 31 de agosto de 2020 en Reino Unido.
// c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
// d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
// y un número de días específico.
// e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
// descripcion de la casa donde la realizaron.
    // f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
    // ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
    // la anterior
// g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
// precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
// actualizados.
// h) Obtener el número de casas que existen para cada uno de los países diferentes.
// i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
// que están ‘limpias’.
// j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.

package estancias;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import estancias.entidades.Cliente;
import estancias.servicios.CasaServicio;
import estancias.servicios.ClienteServicio;
import estancias.servicios.EstanciaServicio;
import estancias.servicios.FamiliaServicio;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);

        CasaServicio casaSv = new CasaServicio();
        ClienteServicio clienteSv = new ClienteServicio();
        FamiliaServicio familiaSv = new FamiliaServicio();
        EstanciaServicio estanciaSv = new EstanciaServicio();

        try {
            System.out.println("Iniciando programa Java para DATABASE estancias_exterior");

            int opcion = 0;
            boolean salir = false;
            do{
                System.out.println("----------------------------------------------");
                System.out.println("MENU:");
                System.out.println("1. Listar las familias que tienen al menos 3 hijos con edad maxima menor a 10 anios.\n" + 
                        "2. Listar las casas disponibles para el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.\n" + 
                        "3. Listar las familias cuya direccion de mail sea de Hotmail.\n" + 
                        "4. Listar las casas disponibles a partir de una fecha dada y un numero de dias especifico.\n" + 
                        "5. Listar las estancias que han sido reservadas por un cliente, informacion del cliente y de la casa.\n" + 
                        "6. Incrementar el precio por dia en un 5% de las casas del Reino Unido. Mostar los precios actualizados.\n" + 
                        "7. Obtener el numero de casas que existen para cada uno de los paises diferentes.\n" + 
                        "8. Listar casas del Reino Unido de las que se ha comentado que estan 'limpias'.\n" + 
                        "9. Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.\n" +
                        "10. Salir.");
                System.out.print("Ingrese una opcion => ");
                opcion = read.nextInt();
                read.nextLine();
                switch(opcion){
                    case 1:
                        familiaSv.ejecutarListarFamilias3hijos10anios();
                        break;
                    case 2:
                        casaSv.ejecutarListarCasasDisponibles();
                        break;
                    case 3:
                        familiaSv.ejecutarListarFamiliasHotmail();
                        break;
                    case 4:
                        casaSv.ejecutarListarCasasPorFechaYdias();
                        break;
                    case 5:
                        estanciaSv.ejecutarListarEstanciasConClientes();
                        break;
                    case 6:
                        casaSv.ejecutarListarCasasReinoUnidoPrecioDevaluado();
                        break;
                    case 7:
                        casaSv.ejecutarListarNumCasasPorPais();
                        break;
                    case 8:
                        casaSv.ejecutarListarCasasReinoUnidoLimpias();
                        break;
                    case 9:
                        System.out.println("Bienvenido al sistema de registro para estancias!");
                        // NUEVO CLIENTE
                        Cliente cliente = clienteSv.ejecutarGuardarClienteYretornar();
                        // NUEVA ESTANCIA
                        estanciaSv.ejecutarGuardarEstancia(cliente);
                        break;
                    case 10:
                        salir = true;
                        System.out.println("Finalizando..");
                        break;
                    default :
                        System.out.println("Opcion incorrecta");
                }
            }while(salir==false);

        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        read.close();

    }
}
