import entidadesLibro.Libro;

public class App {
    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro();
        
        libro1.rellenarLibro();
        
        System.out.println(libro1);

    }
}
