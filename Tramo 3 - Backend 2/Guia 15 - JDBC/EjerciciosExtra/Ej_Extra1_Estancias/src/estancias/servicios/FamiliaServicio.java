package estancias.servicios;

import java.util.Collection;

import estancias.entidades.Casa;
import estancias.entidades.Familia;
import estancias.persistencia.FamiliaDAO;

public class FamiliaServicio {
        
    private FamiliaDAO dao;

    public FamiliaServicio(){
        dao = new FamiliaDAO();
    }

    // nombre,edad_minima,edad_maxima,num_hijos,email,id_casa_familia
    public void crearFamilia(String nombre, int edad_minima, int edad_maxima, int num_hijos, String email, Casa casa_familia) throws Exception {
        try {
        
            // Validamos
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("El campo Nombre es obligatorio");
            }
            if(email == null || email.trim().isEmpty()){
                throw new Exception("El campo Email es obligatorio");
            }
            if(casa_familia == null){
                throw new Exception("El campo ID Casa Familia es obligatorio");
            }

            // Creamos la familia
            Familia familia = new Familia();
            familia.setNombre(nombre);
            familia.setEdad_minima(edad_minima);
            familia.setEdad_maxima(edad_maxima);
            familia.setNum_hijos(num_hijos);
            familia.setEmail(email);
            familia.setCasa_familia(casa_familia);

            // Guarda la familia en la database
            dao.guardarFamilia(familia);  

        } catch(Exception e) {
            throw e;
        }
    }

    // public void eliminarFamilia() throws Exception {
    //     try{
            
    //         Familia familia = null;
    //         do {
    //             System.out.print("Ingrese codigo de la familia => ");
    //             Integer codigoFamilia = read.nextInt();
    //             read.nextLine();
    //             familia = new FamiliaDAO().buscarFamiliaPorCodigo(codigoFamilia);
    //             if(fabricante.getCodigo()==null){
    //                 System.err.println("No se encuentra ningun registro para este código");
    //             }
    //         } while(fabricante.getCodigo()==null);

    //         dao.eliminarFabricante(fabricante);
            
    //     }catch(Exception e){
    //         throw e;
    //     }
    // }

    ////////////////////////////////////////////////////////////////////

// a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    public void ejecutarListarFamilias3hijos10anios() throws Exception {
        try{
            Collection<Familia> familias = dao.listarFamilias3hijos10anios();

            System.out.println("----------------------------------------------");
            System.out.println("Familias: (num_hijos >= 3 && edad_max < 10)");
            for (Familia f: familias) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("id_familia = "+f.getId_familia()+" || nombre = "+f.getNombre()+" || edad_min = "+f.getEdad_minima()+" || edad_max = "+f.getEdad_maxima()+" || num_hijos = "+f.getNum_hijos()+" ||\n"+
                    "email = "+f.getEmail()+" || id_casa_familia = "+f.getCasa_familia().getId_casa());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
    public void ejecutarListarFamiliasHotmail() throws Exception {
        try{
            Collection<Familia> familias = dao.listaFamiliasHotmail();

            System.out.println("----------------------------------------------");
            System.out.println("Familias: (email LIKE '@hotmail')");
            for (Familia f: familias) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("id_familia = "+f.getId_familia()+" || nombre = "+f.getNombre()+" || edad_min = "+f.getEdad_minima()+" || edad_max = "+f.getEdad_maxima()+" || num_hijos = "+f.getNum_hijos()+" ||\n"+
                    "email = "+f.getEmail()+" || id_casa_familia = "+f.getCasa_familia().getId_casa());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
