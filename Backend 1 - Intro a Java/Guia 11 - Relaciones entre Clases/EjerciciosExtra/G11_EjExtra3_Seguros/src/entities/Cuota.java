// D. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
//      Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
//        cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia, etc.).

package entities;

public class Cuota {
   
    private String formaDePago;
    private int numeroDeCuota;
    private double montoDeCuota;
    private boolean pagada;
    private String fechaDeVencimiento;
    
    public Cuota(int formaPago, int numCuota, double montoCuota){
        switch(formaPago){
            case 1:
            this.formaDePago = "Efectivo";
            break;
            case 2:
            this.formaDePago = "Débito";
            break;
            case 3:
            this.formaDePago = "Crédito";
            break;
            case 4:
            this.formaDePago = "Transferencia";
            break;
        }
        this.numeroDeCuota = numCuota;
        this.montoDeCuota = montoCuota;
        this.pagada = false;
        this.fechaDeVencimiento = "Fecha de vencimiento imaginaria";    // TAREA: AVERIGUAR SOBRE FECHAS
    }


    public String getFormaDePago() {
        return formaDePago;
    }


    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }


    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }


    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }


    public double getMontoDeCuota() {
        return montoDeCuota;
    }


    public void setMontoDeCuota(double montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }


    public boolean isPagada() {
        return pagada;
    }


    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }


    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }


    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }


    @Override
    public String toString() {
        return "Cuota [formaDePago=" + formaDePago + ", numeroDeCuota=" + numeroDeCuota + ", montoDeCuota="
                + montoDeCuota + ", pagada=" + pagada + ", fechaDeVencimiento=" + fechaDeVencimiento + "]";
    }

    

}
