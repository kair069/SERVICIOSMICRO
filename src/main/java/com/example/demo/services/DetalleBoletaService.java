package com.example.demo.services;

import com.example.demo.entities.DetalleBoleta;

import java.util.List;

public interface DetalleBoletaService {
    DetalleBoleta guardarDetalleBoleta(DetalleBoleta detalleBoleta);
    DetalleBoleta obtenerDetalleBoletaPorId(Long id);
    List<DetalleBoleta> obtenerTodosLosDetallesBoleta();
    void eliminarDetalleBoleta(Long id);
    // Puedes agregar más métodos según tus necesidades
}
