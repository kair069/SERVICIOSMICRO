package com.example.demo.services;


import com.example.demo.entities.DetalleFactura;
import com.example.demo.repository.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService{
    private final DetalleFacturaRepository detalleFacturaRepository;

    @Autowired
    public DetalleFacturaServiceImpl(DetalleFacturaRepository detalleFacturaRepository) {
        this.detalleFacturaRepository = detalleFacturaRepository;
    }

    @Override
    public DetalleFactura guardarDetalleFactura(DetalleFactura detalleFactura) {
        return detalleFacturaRepository.save(detalleFactura);
    }

    @Override
    public DetalleFactura obtenerDetalleFacturaPorId(Long id) {
        return detalleFacturaRepository.findById(id).orElse(null);
    }

    @Override
    public List<DetalleFactura> obtenerTodosLosDetallesFactura() {
        return detalleFacturaRepository.findAll();
    }

    @Override
    public void eliminarDetalleFactura(Long id) {
        detalleFacturaRepository.deleteById(id);
    }

}
