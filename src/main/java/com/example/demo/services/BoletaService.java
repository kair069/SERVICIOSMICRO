package com.example.demo.services;
import com.example.demo.entities.Boleta;

import java.util.List;

public interface BoletaService {
    Boleta guardarBoleta(Boleta boleta);
    Boleta obtenerBoletaPorId(Long id);
    List<Boleta> obtenerTodasLasBoletas();
    void eliminarBoleta(Long id);
}
