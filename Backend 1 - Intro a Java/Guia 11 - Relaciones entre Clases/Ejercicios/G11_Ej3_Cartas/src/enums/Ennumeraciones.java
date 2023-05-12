package enums;

public class Ennumeraciones {
    
    public enum Carta {
        CARTA_O1("Oro",1), CARTA_O2("Oro",2), CARTA_O3("Oro",3), CARTA_O4("Oro",4), CARTA_O5("Oro",5), CARTA_O6("Oro",6), CARTA_O7("Oro",7), CARTA_O10("Oro",10), CARTA_O11("Oro",11), CARTA_O12("Oro",12),
        CARTA_E1("Espada",1), CARTA_E2("Espada",2), CARTA_E3("Espada",3), CARTA_E4("Espada",4), CARTA_E5("Espada",5), CARTA_E6("Espada",6), CARTA_E7("Espada",7), CARTA_E10("Espada",10), CARTA_E11("Espada",11), CARTA_E12("Espada",12),
        CARTA_C1("Copa",1), CARTA_C2("Copa",2), CARTA_C3("Copa",3), CARTA_C4("Copa",4), CARTA_C5("Copa",5), CARTA_C6("Copa",6), CARTA_C7("Copa",7), CARTA_C10("Copa",10), CARTA_C11("Copa",11), CARTA_C12("Copa",12),
        CARTA_B1("Basto",1), CARTA_B2("Basto",2), CARTA_B3("Basto",3), CARTA_B4("Basto",4), CARTA_B5("Basto",5), CARTA_B6("Basto",6), CARTA_B7("Basto",7), CARTA_B10("Basto",10), CARTA_B11("Basto",11), CARTA_B12("Basto",12);

        private final String palo;
        private final Integer valor;

        private Carta(String palo, Integer valor) {
            this.palo = palo;
            this.valor = valor;
        }

        public String getPalo() {
            return palo;
        }

        public Integer getValor() {
            return valor;
        }
    }
  
}
