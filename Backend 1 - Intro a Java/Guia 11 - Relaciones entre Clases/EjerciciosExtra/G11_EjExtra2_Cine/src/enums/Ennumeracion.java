package enums;

public class Ennumeracion {
    
    public enum Columna{

        A(0),B(1),C(2),D(3),E(4),F(5);

        private Integer posicion;

        private Columna(){}

        private Columna(Integer posicion) {
            this.posicion = posicion;
        }

        public static String getColumnaPorPosicion(int posicion) {
            for (Columna columna : Columna.values()) {
                if (columna.getPosicion() == posicion) { // Si el numero concuerda con el numero del valor
                    return columna.name();
                }
            }
            return null; // Si no se encuentra ninguna coincidencia
        }

        public Integer getPosicion() {
            return posicion;
        }

        public void setPosicion(Integer posicion) {
            this.posicion = posicion;
        }

    }

    public enum Nombre{
        
        DANIEL(0), LUCIA(1), FERNANDO(2), MATIAS(3), JULIAN(4), MARTIN(5), SEBASTIAN(6), GIAN(7), HECTOR(8), BARBARA(9), MELINA(10), SOFIA(11), ESTEBAN(12), CARLOS(13), PAULA(14), RICARDO(15);
    
        private Integer posicion;

        private Nombre(){}

        private Nombre(Integer posicion) {
            this.posicion = posicion;
        }

        public static String getNombrePorPosicion(int posicion) {
            for (Nombre nombre : Nombre.values()) {
                if (nombre.getPosicion() == posicion) { // Si el numero concuerda con el numero del valor
                    return nombre.name();
                }
            }
            return null; // Si no se encuentra ninguna coincidencia
        }

        public Integer getPosicion() {
            return posicion;
        }

        public void setPosicion(Integer posicion) {
            this.posicion = posicion;
        }

    }

}
