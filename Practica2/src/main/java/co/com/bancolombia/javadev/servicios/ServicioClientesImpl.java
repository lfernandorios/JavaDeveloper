package co.com.bancolombia.javadev.servicios;

import co.com.bancolombia.javadev.modelos.Banco;
import co.com.bancolombia.javadev.modelos.Cliente;

import java.util.ArrayList;

public class ServicioClientesImpl implements ServicioClientes{

    private Banco banco;

    public ServicioClientesImpl(Banco banco){
        this.banco = banco;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        this.banco.agregarCliente(cliente);
        return true;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        for (Cliente cliente : this.banco.getClientes()) {
            if(cliente.getNumero() == numero){
                this.banco.eliminarCliente(cliente);
                break;
            }
        }
        return true;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        Cliente clienteEncotrado = null;
        for (Cliente cliente : this.banco.getClientes()) {
            if (cliente.getNumero() == numero) {
                clienteEncotrado = cliente;
                break;
            }
        }

        return clienteEncotrado;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return this.banco.getClientes();
    }

    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        Cliente clienteEncotrado = null;
        for (Cliente cliente : this.banco.getClientes()) {
            if (cliente.getRfc() == rfc) {
                clienteEncotrado = cliente;
                break;
            }
        }

        return clienteEncotrado;
    }
}
