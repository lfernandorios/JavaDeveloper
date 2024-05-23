package co.com.bancolombia.javadev.servicios;

import co.com.bancolombia.javadev.modelos.Cliente;
import co.com.bancolombia.javadev.modelos.Cuenta;

import java.util.ArrayList;

public class ServicioCuentasImpl implements ServicioCuentas{

    Cliente cliente;

    public ServicioCuentasImpl(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        this.cliente.agregarCuenta(cuenta);
        return true;
    }

    @Override
    public boolean cancelarCuenta(int numeroCuenta) {
        this.cliente.getCuentaPorNumero(numeroCuenta).setFechaCancelacion("2024-05-22");
        return true;
    }

    @Override
    public void abonarEnCuenta(int numeroCuenta, double abono) {
        if (abono < 0) {
            throw new IllegalArgumentException("El abono no puede ser negativo");
        }
        this.cliente.getCuentaPorNumero(numeroCuenta).depositar(abono);
    }

    @Override
    public void retirarDeCuenta(int numeroCuenta, double retiro) {
        if (retiro < 0) {
            throw new IllegalArgumentException("El retiro no puede ser negativo");
        }
        this.cliente.getCuentaPorNumero(numeroCuenta).retirar(retiro);

    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas(int numeroCliente) {
        return this.cliente.getCuentas();
    }

    @Override
    public Cuenta buscarCuentaPorNumero(int numeroCuenta) {
        return this.cliente.getCuentaPorNumero(numeroCuenta);
    }

}
