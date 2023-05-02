import services.TiendaService;

public class App {
    public static void main(String[] args) throws Exception {
        TiendaService ts = new TiendaService();

        ts.añadirProductos();
        ts.modificarPrecio();
        ts.mostrarLista();
        
    }
}
