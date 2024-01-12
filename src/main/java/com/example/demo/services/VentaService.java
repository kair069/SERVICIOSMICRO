package com.example.demo.services;

import com.example.demo.entities.Venta;
import com.example.demo.repository.VentaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface VentaService {


    Venta guardarVenta(Venta venta);
    List<Venta> obtenerTodasLasVentas();
    Venta obtenerVentaPorId(Long ventaId);
    void eliminarVenta(Long ventaId);
    // Otros métodos de servicio

    List<Venta> buscarVentasPorMarca(String marca);

    BigDecimal calcularTotalVenta(Long ventaId);





}
