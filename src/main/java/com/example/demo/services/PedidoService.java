package com.example.demo.services;

import com.example.demo.entities.Pedido;

import java.util.List;

public interface PedidoService {
    Pedido guardarPedido(Pedido pedido);
    List<Pedido> obtenerTodosLosPedidos();
    Pedido obtenerPedidoPorId(Long pedidoId);
    void eliminarPedido(Long pedidoId);
    // Otros métodos de servicio
}
