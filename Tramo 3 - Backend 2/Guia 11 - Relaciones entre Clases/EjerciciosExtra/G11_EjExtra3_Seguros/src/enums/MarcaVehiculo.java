package enums;

public enum MarcaVehiculo {

    TOYOTA("Corolla", "Camry", "Rav4", "Yaris", "Prius"),
    FORD("Focus", "Mustang", "Escape", "Explorer", "F-150"),
    CHEVROLET("Cruze", "Malibu", "Equinox", "Tahoe", "Silverado"),
    HONDA("Civic", "Accord", "CR-V", "Pilot", "Odyssey"),
    BMW("3 Series", "5 Series", "X3", "X5", "7 Series");

    private String[] modelos;

// (String... modelos) = ... representa una cantidad de argumentos variables del tipo String, 
    private MarcaVehiculo(String... modelos) {  // (ej, desde 1 modelo, hasta infinitos modelos)
        this.modelos = modelos;
    }

    public String[] getModelos() {
        return modelos;
    }
}
