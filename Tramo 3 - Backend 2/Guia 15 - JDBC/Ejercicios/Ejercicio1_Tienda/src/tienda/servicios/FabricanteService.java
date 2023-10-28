package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {
    
    private Scanner read = new Scanner(System.in);
    private FabricanteDAO dao;

    public FabricanteService(){
        dao = new FabricanteDAO();
    }
    
    public void crearFabricante(String nombre) throws Exception {
        try {
        
            // Validamos
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("El campo Nombre es obligatorio");
            }
            if(dao.buscarFabricantePorNombre(nombre) != null){
                throw new Exception("Ya existe un fabricante con el nombre indicado.");
            }

            // Creamos el producto
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);

            // Guarda el producto en la database
            dao.guardarFabricante(fabricante);  

        } catch(Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante() throws Exception {
        try{
            
            Fabricante fabricante = null;
            do {
                System.out.print("Ingrese codigo del fabricante => ");
                Integer codigoFabricante = read.nextInt();
                read.nextLine();
                fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                if(fabricante.getCodigo()==null){
                    System.err.println("No se encuentra ningun registro para este código");
                }
            } while(fabricante.getCodigo()==null);

            dao.eliminarFabricante(fabricante);
            
        }catch(Exception e){
            throw e;
        }
    }

    ////////////////////////////////////////////////////////////////////

// 7. Ingresar un fabricante a la base de datos
    public void ejecutarNuevoFabricante() throws Exception {
        try{
            System.out.println("Nuevo fabricante:");
            System.out.print("Ingrese un nombre de fabricante => ");
            String nombre = read.nextLine();

            crearFabricante(nombre);

        }catch(Exception e){
            throw e;
        }
    }

// EXTRA
    public void ejecutarListarFabricantes(){
        try{
            Collection<Fabricante> fabricantes = dao.listarFabricantes();

            System.out.println("----------------------------------------------");
            System.out.println("Fabricantes: (*)");
            for (Fabricante f : fabricantes) {
                System.out.println("codigo = "+f.getCodigo()+" || nombre = "+f.getNombre());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
