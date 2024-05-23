package co.com.bancolombia.javadev.modelos;

public class CuentaDeAhorro extends Cuenta {

    private Double tasaInteresMensual;

    public CuentaDeAhorro(int numero, String fechaApertura, double saldo, Double tasaInteresMensual) {
        super(numero, fechaApertura, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public Double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(Double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public Double calcularIntereses(){
        return this.getSaldo() * this.getTasaInteresMensual();
    }

    @Override
    public void depositar(double cantidad) {
        this.setSaldo(this.getSaldo() + cantidad);
    }

    @Override
    public void retirar(double cantidad) {

        if (this.getSaldo() < cantidad){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.setSaldo(this.getSaldo() - cantidad);
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                "Fecha de apertura=" + getFechaApertura() +
                "Fecha de cancelacion=" + getFechaCancelacion() +
                '}';
    }
}
