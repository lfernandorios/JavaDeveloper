package co.com.bancolombia.javadev.modelos;

public class CuentaDeCheque extends Cuenta{

    private Double costoManejoMensual;
    private Double topeSobregiro;

    public CuentaDeCheque(int numero, String fechaApertura, double saldo, Double costoManejoMensual, Double topeSobregiro) {
        super(numero, fechaApertura, saldo);
        this.costoManejoMensual = costoManejoMensual;
        this.topeSobregiro = topeSobregiro;
    }

    public Double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(Double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    public void cobrarCostoManejo(){
        this.setSaldo(this.getSaldo() - this.getCostoManejoMensual());
    }

    public Double getTopeSobregiro() {
        return topeSobregiro;
    }

    public void setTopeSobregiro(Double topeSobregiro) {
        this.topeSobregiro = topeSobregiro;
    }

    @Override
    public void depositar(double cantidad) {
        this.setSaldo(this.getSaldo() + cantidad);
    }

    @Override
    public void retirar(double cantidad) {
        if (this.getSaldo() + this.getTopeSobregiro() < cantidad) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.setSaldo(this.getSaldo() - cantidad);

    }

    @Override
    public String toString() {
        return "CuentaDeCheque{" +
                "costoManejoMensual=" + costoManejoMensual +
                ", topeSobregiro=" + topeSobregiro +
                "Fecha de apertura=" + getFechaApertura() +
                "Fecha de cancelacion=" + getFechaCancelacion() +
                '}';
    }
}
