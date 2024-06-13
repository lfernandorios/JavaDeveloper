package co.com.bancolombia.javadev;

import co.com.bancolombia.javadev.modelos.*;
import co.com.bancolombia.javadev.servicios.ServicioClientes;
import co.com.bancolombia.javadev.servicios.ServicioClientesImpl;
import co.com.bancolombia.javadev.servicios.ServicioCuentasImpl;

public class App {

    public static void main(String[] args) {
        System.out.println("App de Banco!\n");
        System.out.println("Paso 1: Creando Banco\n");

        Domicilio domicilioBanco = new Domicilio("Carrera 46", 123, "Centro", "Antioquia", 5000);
        Banco banco1 = new Banco("Bancolombia", domicilioBanco, "RFC123456", "6044484848");

        System.out.println("Confirmación 1: Banco Creado: " + banco1.toString() + "\n");
        ServicioClientes servicioClientes = new ServicioClientesImpl(banco1);


        System.out.println("Paso 2: Creando Clientes y sus cuentas\n");

        Domicilio domicilioCliente1 = new Domicilio("Calle 1", 123, "Centro", "Antioquia", 5000);
        Domicilio domicilioCliente2 = new Domicilio("Calle 2", 987, "Occidente", "Antioquia", 5001);
        Cliente cliente1 = new Cliente(123456, "Juan Perez", domicilioCliente1, "RFC09845", "6044484848", "1987-10-29");
        Cliente cliente2 = new Cliente(987654, "Maria Lopez", domicilioCliente2, "RFC09846", "6044484849", "1988-10-29");

        ServicioCuentasImpl servicioCuentas1 = new ServicioCuentasImpl(cliente1);
        ServicioCuentasImpl servicioCuentas2 = new ServicioCuentasImpl(cliente2);

        Cuenta cuentaCheque1 = new CuentaDeCheque(123, "2024-05-22", 1000.0, 10.0, 100.0);
        Cuenta cuentaAhorro1 = new CuentaDeAhorro(987, "2024-05-22",1200.0, 0.01);

        servicioCuentas1.agregarCuenta(cuentaCheque1);
        servicioCuentas1.agregarCuenta(cuentaAhorro1);

        Cuenta cuentaCheque2 = new CuentaDeCheque(456, "2024-05-22", 2000.0, 10.0, 100.0);
        Cuenta cuentaAhorro2 = new CuentaDeAhorro(654, "2024-05-22", 2500.0, 0.008);

        servicioCuentas2.agregarCuenta(cuentaCheque2);
        servicioCuentas2.agregarCuenta(cuentaAhorro2);

        servicioClientes.agregarCliente(cliente1);
        servicioClientes.agregarCliente(cliente2);

        System.out.println("Confirmación 2: Clientes Creados, sus cuentas y agregados al banco\n");
        System.out.println("Cliente 1: " + cliente1.toString());
        System.out.println("Cuentas de Cliente 1: " + cliente1.getCuentas().toString() + "\n");
        System.out.println("Cliente 2: " + cliente2.toString());
        System.out.println("Cuentas de Cliente 2: " + cliente2.getCuentas().toString() + "\n");


        System.out.println("Paso 3: Realizando operaciones en cuentas\n");

        System.out.println("Abonando $100 en cuenta 123 - Cliente 1");
        servicioCuentas1.abonarEnCuenta(123, 100.0);
        System.out.println("Saldo de Cuenta 123 - Transacción1: " + cliente1.getCuentaPorNumero(123).getSaldo() + "\n");

        System.out.println("Retirando $50 de cuenta 123 - Cliente 1");
        servicioCuentas1.retirarDeCuenta(123, 50.0);
        System.out.println("Saldo de Cuenta 123 - Transacción2: " + cliente1.getCuentaPorNumero(123).getSaldo()+ "\n");

        System.out.println("Cancelando cuenta 987 - Cliente 1");
        servicioCuentas1.cancelarCuenta(987);
        System.out.println("Estado de Cuenta 987: " + cliente1.getCuentaPorNumero(987).toString());

    }
}
