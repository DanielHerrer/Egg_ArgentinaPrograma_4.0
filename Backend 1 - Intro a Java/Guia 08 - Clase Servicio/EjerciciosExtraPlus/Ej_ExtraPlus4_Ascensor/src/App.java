import entidades.Ascensor;
import servicios.AscensorServicios;

public class App {
    public static void main(String[] args) throws Exception {
        AscensorServicios as = new AscensorServicios();
        Ascensor a = new Ascensor();

        System.out.println(a.toString());
        as.irA(a, 7);
        as.bajarPiso(a);
        as.bajarPiso(a);
        as.bajarPiso(a);
        as.subirPiso(a);
        System.out.println(a.toString());
    }
}
