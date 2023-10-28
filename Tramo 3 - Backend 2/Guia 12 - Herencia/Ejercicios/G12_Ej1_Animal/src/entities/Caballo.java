package entities;

public class Caballo extends Animal{
    
    public Caballo(){}

    public Caballo(String nombre, String alimento, int edad, String raza){
        super(nombre,alimento,edad,raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El caballo "+nombre+", se alimenta a base de = "+alimento);
    }

}
