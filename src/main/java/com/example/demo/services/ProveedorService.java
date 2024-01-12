package com.example.demo.services;

import com.example.demo.entities.Proveedor;

import java.util.Date;
import java.util.List;

public interface ProveedorService {

    Proveedor guardarProveedor(Proveedor proveedor);
    Proveedor obtenerProveedorPorId(Long id);
    List<Proveedor> obtenerTodosLosProveedores();
    void eliminarProveedor(Long id);
    // Otros métodos según sea necesario


    // Métodos adicionales
    List<Proveedor> buscarProveedoresPorNombre(String nombre);
    Proveedor actualizarProveedor(Long id, Proveedor proveedorActualizado);
    Proveedor obtenerProveedorPorCorreoElectronico(String correoElectronico);
    Proveedor obtenerProveedorPorSitioWeb(String sitioWeb);
    List<Proveedor> obtenerProveedoresPorRangoFechasCaducidad(Date fechaInicio, Date fechaFin);
    long contarTotalProveedores();


}
