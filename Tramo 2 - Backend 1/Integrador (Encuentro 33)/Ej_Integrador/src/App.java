import services.EscuelaService;

public class App {
    public static void main(String[] args) throws Exception {
        
        EscuelaService es = new EscuelaService();
        es.llenarCurso();
        es.mostrarAlumnosDestacados();

    }
}
