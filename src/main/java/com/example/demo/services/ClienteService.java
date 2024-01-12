package com.example.demo.services;


import com.example.demo.entities.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente guardarCliente(Cliente cliente);
    List<Cliente> obtenerTodosLosClientes();
    Cliente obtenerClientePorId(Long clienteId);
    void eliminarCliente(Long clienteId);
    // Otros métodos de servicio
}
