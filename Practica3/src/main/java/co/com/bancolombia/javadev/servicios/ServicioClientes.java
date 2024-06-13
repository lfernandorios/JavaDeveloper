package co.com.bancolombia.javadev.servicios;

import co.com.bancolombia.javadev.modelos.Cliente;

import java.util.ArrayList;
import java.util.TreeSet;

public interface ServicioClientes {
    public boolean agregarCliente(Cliente cliente);
    public boolean eliminarCliente(int numero);
    public Cliente consultarCliente(int numero);
    public TreeSet<Cliente> obtenerClientes();
    public Cliente buscarClientePorRFC(String rfc);
}
