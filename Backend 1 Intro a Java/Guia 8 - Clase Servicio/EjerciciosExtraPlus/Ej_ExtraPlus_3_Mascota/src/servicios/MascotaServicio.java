package servicios;
import java.util.Scanner;
import entidades.Mascota;

public class MascotaServicio {
    
    public Mascota crearMascota(){
        Scanner read = new Scanner(System.in);
        Scanner readInt = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = read.nextLine();
        System.out.println("Ingrese edad:");
        int edad = readInt.nextInt();
        System.out.println("Ingrese raza:");
        String raza = read.nextLine();
        System.out.println("Ingrese tipo:");
        String tipo = read.nextLine();
        read.close();
        readInt.close();
        return new Mascota(nombre,raza,tipo,edad);
    }

    public void mostrarMascota(Mascota m){
        System.out.println(m.toString());
    }

    public void cumplirAnios(Mascota m){
        System.out.println(m.getNombre()+" cumplio años!");
        m.setEdad(m.getEdad()+1);
    }
    
}
