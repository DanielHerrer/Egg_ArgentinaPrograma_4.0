import entities.Raices;
import services.RaicesServicios;

public class App {
    public static void main(String[] args) throws Exception {
        RaicesServicios rs = new RaicesServicios();
        Raices r = rs.crearRaiz();
        rs.calcular(r);
    }
}
