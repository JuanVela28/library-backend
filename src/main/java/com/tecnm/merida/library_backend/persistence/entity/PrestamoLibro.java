package com.tecnm.merida.library_backend.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prestamos_libros")
public class PrestamoLibro {

    @EmbeddedId
    private PrestamoLibroPK id = new PrestamoLibroPK();

    private Integer cantidad;

    private Boolean estado;

    @ManyToOne
    @MapsId("idPrestamo")
    @JoinColumn(name = "id_prestamo")
    private Prestamo prestamo;

    @ManyToOne
    @JoinColumn(name = "id_libro", insertable = false, updatable = false)
    private Libro libro;

    public PrestamoLibroPK getId() {
        return id;
    }

    public void setId(PrestamoLibroPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}