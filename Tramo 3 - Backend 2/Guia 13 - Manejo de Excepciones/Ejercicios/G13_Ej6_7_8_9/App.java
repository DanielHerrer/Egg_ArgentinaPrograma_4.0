package Ejercicios.G13_Ej6_7_8_9;

// 6. Dado el método metodoA de la clase A, indique:
//      a) ¿Qué sentencias y en qué orden se ejecutan SI se produce la excepción MioException?
//      b) ¿Qué sentencias y en qué orden se ejecutan si NO se produce la excepción MioException?

                        // class A {
                        //  public void metodoA() {
                        //      sentencia_a1
                        //      sentencia_a2
                        //      try {
                        //          sentencia_a3
                        //          sentencia_a4
                        //      } catch (MioException e){
                        //          sentencia_a6
                        //      }
                        //      sentencia_a5
                        //  }
                        // }

// Respuesta A: sentencia_a1 => sentencia_a2 => sentencia_a3 => sentencia_a6 => sentencia_a5
// Respuesta B: sentencia_a1 => sentencia_a2 => sentencia_a3 => sentencia_a4 => sentencia_a5

// 7. Dado el método metodoB de la clase B, indique:
//      a) ¿Qué sentencias y en qué orden se ejecutan SI se produce la excepción MioException?
//      b) ¿Qué sentencias y en qué orden se ejecutan si NO se produce la excepción MioException?

// class B {
//  public void metodoB() {
//      sentencia_b1
//      try {
//          sentencia_b2
//      } catch (MioException e) {
//          sentencia_b3
//      } finally {
//          sentencia_b4
//      }
//  }
// }

// Respuesta A: sentencia_b1 => sentencia_b2 => sentencia_b3 => sentencia_b4
// Respuesta B: sentencia_b1 => sentencia_b2 => sentencia_b4

// 8. Indique qué se mostrará por pantalla cuando se ejecute cada una de estas clases:

// class Uno{

//  private static int metodo() {
//      int valor=0;
//      try {
//          valor = valor+1;
//          valor = valor + Integer.parseInt (”42”);
//          valor = valor +1;
//          System.out.println(”Valor final del try:” + valor) ;
//      } catch (NumberFormatException e) {
//          Valor = valor + Integer.parseInt(”42”);
//          System.out.println(“Valor final del catch:” + valor);
//      } finally {
//          valor = valor + 1;
//          System.out.println(”Valor final del finally: ” + valor) ;
//      }
//      valor = valor +1;
//      System.out.println(”Valor antes del return: ” + valor) ;
//      return valor;
//  }

//  public static void main (String[] args) {
//      try {
//          System.out.println (metodo());
//      } catch(Exception e) {
//          System.err.println(”Excepcion en metodo() ”) ;
//          e.printStackTrace();
//      }
//  }

// }

// RESPUESTA Uno = 

//      Valor final del try: 44
//      Valor final del finally: 45
//      Valor antes del return: 46
//      46

// class Dos{

//  private static int metodo() {
//      int valor=0;
//      try{
//          valor = valor + 1;
//          valor = valor + Integer.parseInt(”W”);
//          valor = valor + 1;
//          System.out.println(”Valor final del try: ” + valor) ;
//      } catch ( NumberFormatException e ) {
//          valor = valor + Integer.parseInt (”42”);
//          System.out.println(”Valor final del catch: ” + valor) ;
//      } finally {
//          valor = valor + 1;
//          System.out.println(”Valor final del finally: ” + valor) ;
//      }
//      valor = valor + 1;
//      System.out.println(”Valor antes del return: ” + valor) ;
//      return valor;
//  }

//  public static void main (String[] args) {
//      try{
//          System.out.println ( metodo ( ) ) ;
//      } catch(Exception e) {
//          System.err.println ( ” Excepcion en metodo ( ) ” ) ;
//          e.printStackTrace();
//      }
//  }

// }

// RESPUESTA Dos = 

//      Valor final del catch: : 43
//      Valor final del finally: 44
//      Valor antes del return: 45
//      45

//  class Tres{

//      private static int metodo( ) {
//          int valor=0;
//          try {
//              valor = valor + 1;
//              valor = valor + Integer.parseInt (”W”);
//              valor = valor + 1;
//              System.out.println(”Valor final del try: ” + valor);
//          } catch(NumberFormatException e) {
//              valor = valor + Integer.parseInt (”W”);
//              System.out.println(”Valor final del catch: ” + valor);
//          } finally {
//              valor = valor + 1;
//              System.out.println(”Valor final del finally: ” + valor);
//          }
//          valor = valor + 1;
//          System.out.println(”Valor antes del return: ” + valor) ;
//          return valor;
//      }

//      public static void main (String[] args) {
//          try{
//              System.out.println( metodo ( ) ) ;
//          } catch(Exception e) {
//              System.err.println(”Excepcion en metodo ( ) ” ) ;
//              e.printStackTrace();
//          }
//      }

// }

// RESPUESTA Tres = 

//      Valor final del finally: 2
//      Excepcion en metodo ( )

public class App {
    public static void main(String[]args){

        System.out.println("Solo soy un sout");

    }
}