package co.com.bancolombia.javadev.modelos;

public abstract class Cuenta implements Comparable<Cuenta>{
    private int numero;
    private String fechaApertura;
    private double saldo;
    private String fechaCancelacion;


    public Cuenta(int numero, String fechaApertura, double saldo) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public abstract void depositar(double cantidad);

    public abstract void retirar(double cantidad);

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cuenta o) {
        return Double.toString(this.saldo).compareTo(Double.toString(o.getSaldo()));
    }


}
