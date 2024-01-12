package com.example.demo.services;

import com.example.demo.entities.Producto;

import java.util.List;

public interface ProductoService {
    Producto guardarProducto(Producto producto);
    List<Producto> obtenerTodosLosProductos();
    Producto obtenerProductoPorId(Long productoId);
    void eliminarProducto(Long productoId);
    // Otros métodos de servicio
}
