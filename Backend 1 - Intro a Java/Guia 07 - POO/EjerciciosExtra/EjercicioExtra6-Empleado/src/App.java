/// EJERCICIO EXTRA 6 - Daniel F. Herrera
// Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
// Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en 
// función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene 
// más de 30 años o del 5% si tiene menos de 30 años.

public class App {
    public static void main(String[] args) throws Exception {
        Empleado emp1 = new Empleado("Daniel",24,47000);
        System.out.println(emp1.toString());
        System.out.println("////////////////// Realizando aumento /////////////////");
        emp1.calcular_aumento();
        System.out.println(emp1.toString());
    }
}
