// Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
// un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas 
// que puede realizar el usuario. 

package entities;

public class Ahorcado{
    private String palabraSecreta[];
    private int letrasEncontradas;
    private int letraVecesEncontrada;
    private int intentosRestantes;
    private int cantidadJugadasMaxima; // 2 piernas, 2 brazos, un torso, una cabeza

    public Ahorcado(String palabra, int intentosMax){
        letraVecesEncontrada = 0;
        intentosRestantes = intentosMax;
        cantidadJugadasMaxima = intentosMax;
        palabraSecreta = new String[palabra.length()];
        for(int i=0; i<palabra.length(); i++){
            palabraSecreta[i] = palabra.substring(i, i+1);
        }
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getLetraVecesEncontrada() {
        return letraVecesEncontrada;
    }

    public void setLetraVecesEncontrada(int letraVecesEncontrada) {
        this.letraVecesEncontrada = letraVecesEncontrada;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public int getCantidadJugadasMaxima() {
        return cantidadJugadasMaxima;
    }

    public void setCantidadJugadasMaxima(int cantidadJugadasMaxima) {
        this.cantidadJugadasMaxima = cantidadJugadasMaxima;
    }

    


    

}