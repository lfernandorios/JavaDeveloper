package co.com.bancolombia.javadev.servicios;

import co.com.bancolombia.javadev.modelos.Cuenta;

import java.util.ArrayList;

public interface ServicioCuentas {
    public boolean agregarCuenta(Cuenta cuenta);
    public boolean cancelarCuenta(int numeroCuenta);
    public void abonarEnCuenta(int numeroCuenta, double abono);
    public void retirarDeCuenta(int numeroCuenta, double retiro);
    public ArrayList<Cuenta> obtenerCuentas(int numeroCliente);
    public Cuenta buscarCuentaPorNumero(int numeroCuenta);
}
