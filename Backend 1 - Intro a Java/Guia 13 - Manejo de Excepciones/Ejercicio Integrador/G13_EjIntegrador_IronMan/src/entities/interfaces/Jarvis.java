// En esta primera etapa con una armadura podremos: 
//   (caminar, correr, propulsar, volar, escribir y leer)

//      • Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//      establecida como consumo en la bota por el tiempo en el que se camine.

//      • Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//      energía establecida como consumo en la bota por el tiempo en el que se corra.

//      • Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//      energía por el tiempo que dure la propulsión.

//      • Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
//      consumiendo el triple de la energía establecida para las botas y el doble para los guantes.

//      • Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.

//      • Al utilizar las botas para caminar o correr el consumo es normal durante el tiempo que se
//      camina o se corra.

//      • Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
//      establecido en estos dispositivos. Solo se usa en nivel básico.

//      • Cada vez que se efectúa una acción se llama a los métodos usar(int intensidad, int tiempo) del dispositivo se le pasa
//      el nivel de intensidad y el tiempo. El dispositivo debe retornar la energía consumida y la
//      armadura deberá informar al generador se ha consumido esa cantidad de energía.

package entities.interfaces;

public interface Jarvis {
    
    public void caminar(int intensidad, int tiempo);

    public void correr(int intensidad, int tiempo);
    
    public void propulsarse(int intensidad, int tiempo);

    public void volar(int intensidad, int tiempo);

    public void escribir();

    public void leer();

    public void disparar(int intensidad, int tiempo);

}
