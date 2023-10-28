package service;

import java.util.HashSet;
import java.util.Scanner;

import entities.Cliente;
import entities.Cuota;
import entities.Poliza;
import entities.Vehiculo;

public class Service {
    private Scanner read = new Scanner(System.in);

    //////////////////////////////////////// CLIENTES //////////////////////////////////////////////

    public Cliente crearCliente(){
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = read.nextLine();
        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = read.nextLine();
        System.out.print("Ingrese el documento del cliente: ");
        int documento = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el mail del cliente: ");
        String mail = read.nextLine();
        System.out.print("Ingrese el domicilio del cliente: ");
        String domicilio = read.nextLine();
        System.out.print("Ingrese el telefono del cliente: ");
        int telefono = read.nextInt();
        read.nextLine();
        
        System.out.println("\u001B[32mCliente creado!\u001B[0m");
        return new Cliente(nombre,apellido,documento,mail,domicilio,telefono);
    }

    public HashSet<Cliente> crearClientes(){
        HashSet<Cliente> clientes = new HashSet<>();
        System.out.println("Ingrese la cantidad de clientes: ");
        int c = read.nextInt();
        read.nextLine();
        for(int i = 0; i < c; i++){
            clientes.add(crearCliente());
        }
        return clientes;
    }

    // public Cliente crearClienteAuto(){

    // }

    /////////////////////////////////////////// VEHICULO ///////////////////////////////////////////

    public Vehiculo crearVehiculo(){
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = read.nextLine();
        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = read.nextLine();
        System.out.print("Ingrese el año del vehiculo: ");
        int anio = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el numero de motor del vehiculo: ");
        int numeroMotor = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el chasis del vehiculo: ");
        String chasis = read.nextLine();
        System.out.print("Ingrese el color del vehiculo: ");
        String color = read.nextLine();
        System.out.print("Ingrese el tipo de vehiculo: ");
        String tipo = read.nextLine();

        System.out.println("\u001B[32mVehiculo creado!\u001B[0m");
        return new Vehiculo(marca,modelo,anio,numeroMotor,chasis,color,tipo);
    }

    public HashSet<Vehiculo> crearVehiculos(){
        HashSet<Vehiculo> vehiculos = new HashSet<>();
        System.out.println("Ingrese la cantidad de vehiculos: ");
        int c = read.nextInt();
        read.nextLine();
        for(int i = 0; i < c; i++){
            vehiculos.add(crearVehiculo());
        }
        return vehiculos;
    }

    // public Vehiculo crearVehiculoAuto(){
        
    //     return new Vehiculo();
    // }

    //////////////////////////////////////////// POLIZA //////////////////////////////////////////

    public Poliza crearPoliza(Vehiculo veh, Cliente cli){
        System.out.print("Ingrese el numero de poliza: ");
        int numeroPoliza = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la fecha de inicio de la poliza: ");
        String fechaInicio = read.nextLine();
        System.out.print("Ingrese la fecha de fin de la poliza: ");
        String fechaFin = read.nextLine();
        
        int formaPago;
        do{
            System.out.print("Forma de pago:\n1.Efectivo\n2.Debito\n3.Credito\n4.Transferencia\nOpcion => ");
            formaPago = read.nextInt();
            read.nextLine();
            if(formaPago<1 || formaPago>4){
                System.out.println("Ingrese una opcion valida..");
            }else{              
                break;
            }
        }while(true);

        System.out.print("Ingrese la cantidad de cuotas: ");
        int cantCuotas = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el monto total asegurado: ");
        double montoTotal = read.nextDouble();
        read.nextLine();
        Cuota[] cuotas = new Cuota[cantCuotas];
        for(int i=0; i<cantCuotas; i++){
            cuotas[i] = new Cuota(formaPago, i+1, montoTotal/cantCuotas);
        }
        
        Boolean granizo = null;
        do{
            System.out.print("Incluye granizo?:\n1.Si\n2.No\nOpcion => ");
            int op = read.nextInt();
            read.nextLine();
            if(op==1){
                granizo=true;
            }else if(op==2){
                granizo=false;
            }else{
                System.out.println("Ingrese una opcion valida");
            }
        }while(granizo == null);
        
        System.out.print("Ingrese monto maximo por el granizo: ");
        double montoMaxGranizo = read.nextDouble();
        read.nextLine();

        int tipoCobertura;
        do{
            System.out.print("Tipo de cobertura:\n1.Cobertura de responsabilidad civil\n2.Cobertura de accidentes personales\n3.Cobertura por robo/hurto\n4.Cobertura por incendio\n5.Cobertura de daños materiales\n6.Cobertura de salud\n7.Cobertura de vida\nOpcion => ");
            tipoCobertura = read.nextInt();
            read.nextLine();
            if(tipoCobertura <= 7 && tipoCobertura >= 1){
                break;
            }else{
                System.out.println("Ingrese una opcion valida");
            }
        }while(true);

        System.out.println("\u001B[32mPoliza creada!\u001B[0m");
        return new Poliza(veh,cli,numeroPoliza,fechaInicio,fechaFin,cuotas,formaPago,montoTotal,granizo,montoMaxGranizo,tipoCobertura);
    }

    //////////////////////////////////////////// CUOTAS //////////////////////////////////////////

    public void gestionCuotas(Poliza poliza){
        System.out.println("Gestion de la Poliza Nº"+poliza.getNumeroPoliza());
        System.out.println("Cliente: "+poliza.getCliente().getNombre()+" "+poliza.getCliente().getApellido());
        System.out.println("Vehiculo: "+poliza.getVehiculo().getMarca()+" "+poliza.getVehiculo().getModelo()+" "+poliza.getVehiculo().getanio());

        boolean salir = false;
        do{
            System.out.println("\u001B[33mMENU Gestion de Cuotas:\u001B[0m");
            System.out.print("1. Pagar cuota\n2. Cantidad de Cuotas\n3. Estado de las Cuotas\n4. Forma de pago\n0. Salir\nOpcion => ");
            int op = read.nextInt();
            read.nextLine();
            switch(op){
                case 1:
                    boolean cuotaPagada = false;
                    do{
                        System.out.print("Cual de las "+poliza.getCuotas().length+" cuotas desea pagar?: ");
                        int num = read.nextInt();
                        read.nextLine();
                        if(num>0 && num<=poliza.getCuotas().length){
                            if(poliza.getCuotas()[num-1].isPagada()){
                                System.out.println("La cuota seleccionada ya está paga");
                            }else{
                                poliza.getCuotas()[num-1].setPagada(true);
                                cuotaPagada=true;
                            }
                        }else{
                            System.out.println("\u001B[31mCuota fuera de rango\u001B[0m");
                        } 
                    }while(!cuotaPagada);
                    break;
                case 2:
                    System.out.println("Cantidad de cuotas: "+poliza.getCuotas().length);
                    break;
                case 3:
                    for(int i=0; i<poliza.getCuotas().length; i++){
                        System.out.print("Cuota nº"+poliza.getCuotas()[i].getNumeroDeCuota()+": ");
                        if(poliza.getCuotas()[i].isPagada()){
                            System.out.println("\u001B[92mPAGADA\u001B[0m");
                        }else{
                            System.out.println("\u001B[91mNO PAGADA\u001B[0m");
                        }
                    }
                    break;
                case 4:
                    System.out.println("La forma de pago empleada es [ "+poliza.getFormaDePago()+" ]");
                    break;
                case 0:
                    System.out.println("\u001B[96mFinalizando gestion de cuotas\u001B[0m");
                    salir=true;
                    break;
                default:
                    System.out.println("\u001B[31mOpcion invalida\u001B[0m");
            }
        }while(!salir);         
    }

}