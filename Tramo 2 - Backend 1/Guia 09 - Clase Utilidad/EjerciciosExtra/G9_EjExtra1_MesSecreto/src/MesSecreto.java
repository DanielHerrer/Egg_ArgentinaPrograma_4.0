import java.util.Scanner;

public class MesSecreto {
    
    Scanner read = new Scanner(System.in);
    private String mesSecreto;
    private String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
        "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    public MesSecreto(){
        mesSecreto = meses[(int)(Math.random()*11)];
    }

    public void adivinarMes(){
        Boolean encontrado = false;
        System.out.println("Mes secreto ["+mesSecreto+"]");
        System.out.print("Adivine el mes secreto => ");
        if(mesSecreto.toLowerCase().equals(read.nextLine().toLowerCase())){     
            encontrado = true;       
        }
        while(encontrado==false){
            System.out.println("No ha acertado.. \nIntente adivinarlo colocando otro mes...");
            System.out.print("Adivine el mes secreto => ");
            if(mesSecreto.toLowerCase().equals(read.nextLine().toLowerCase())){     
                encontrado = true;       
            }
        }
        if(encontrado==true){   
            System.out.println("¡Ha acertado!");    
        }
    }
    
    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

}
