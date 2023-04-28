import servicios.MascotaServicio;
import entidades.Mascota;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MascotaServicio ms = new MascotaServicio();
        Mascota m1 = ms.crearMascota();
        ms.cumplirAnios(m1);
        ms.mostrarMascota(m1);
    }
}
