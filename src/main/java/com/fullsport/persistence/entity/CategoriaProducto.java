package com.fullsport.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;


import java.util.List;

@Entity
@Table(name = "CATEGORIAS_PRODUCTOS")
public class CategoriaProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Integer categoriaId;

    private String nombre;

    private String descripcion;

    @OneToMany(mappedBy ="categoriaProducto" )
    private List<Producto> productos;

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
