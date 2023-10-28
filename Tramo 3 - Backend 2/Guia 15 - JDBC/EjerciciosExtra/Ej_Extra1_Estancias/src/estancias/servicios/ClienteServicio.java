package estancias.servicios;

import java.util.Scanner;

import estancias.entidades.Cliente;
import estancias.persistencia.ClienteDAO;

public class ClienteServicio {
    
    private Scanner read = new Scanner(System.in);
    private ClienteDAO dao;

    public ClienteServicio(){
        dao = new ClienteDAO();
    }

// j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
    // Requiere ingresar primero un cliente
        // Cliente = id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email
    public Cliente ejecutarGuardarClienteYretornar() throws Exception {
        try{
            System.out.println("Ingrese los siguientes datos del nuevo cliente:");
            Cliente cliente = null;
            System.out.println("----------------------------------------------");
            System.out.print("Ingresar NOMBRE de CLIENTE => ");
            String nombre = read.nextLine().trim();
            System.out.print("Ingrese CALLE-NOMBRE => ");
            String calle = read.nextLine().trim();
            System.out.print("Ingrese CALLE-NUMERO => ");
            int numCalle = read.nextInt();
            read.nextLine();
            System.out.print("Ingrese CODIGO POSTAL => ");
            String codigoPostal = read.nextLine();
            System.out.print("Ingrese PAIS => ");
            String pais = read.nextLine().trim();
            System.out.print("Ingrese CIUDAD => ");
            String ciudad = read.nextLine().trim();

            String email;
            do{
                System.out.print("Ingrese email => ");
                email = read.nextLine().trim();
            }while(!email.contains("@"));
            
            // se crea el cliente y se hace INSERT
            cliente = new Cliente(nombre, calle, numCalle, codigoPostal, ciudad, pais, email);
            dao.guardarCliente(cliente);

            // se le setea la ID que nunca fue asignada
            int id_cliente = dao.buscarIdPorCliente(cliente);
            cliente.setId_cliente(id_cliente);

            // retorna el cliente para luego insertarlo en la estancia
            return cliente;

        }catch(Exception e){
            throw e;
        }
        
    }

}
