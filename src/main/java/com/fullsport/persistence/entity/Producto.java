package com.fullsport.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTOS")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "PRODUCT_ID")
    private Integer PRODUCTID;

    private String NOMBRE;

    private String DESCRIPCION;

    private Integer PRECIO;

    private Integer STOCK;

    @Column(name = "PROVEEDOR_ID")
    private Integer PROVEEDORID;

    @Column(name = "CATEGORIA_ID")
    private Integer CATEGORIAID;

    @ManyToOne
    @JoinColumn(name = "categoria_id", insertable = false, updatable = false )
    private CategoriaProducto categoriaProducto ;

    @ManyToOne
    @JoinColumn(name ="proveedor_id",insertable = false,updatable = false )
    private Proveedor proveedor;


    public Integer getPRODUCTID() {
        return PRODUCTID;
    }

    public void setPRODUCTID(Integer PRODUCTID) {
        this.PRODUCTID = PRODUCTID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Integer getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(Integer PRECIO) {
        this.PRECIO = PRECIO;
    }

    public Integer getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(Integer STOCK) {
        this.STOCK = STOCK;
    }

    public Integer getPROVEEDORID() {
        return PROVEEDORID;
    }

    public void setPROVEEDORID(Integer PROVEEDORID) {
        this.PROVEEDORID = PROVEEDORID;
    }

    public Integer getCATEGORIAID() {
        return CATEGORIAID;
    }

    public void setCATEGORIAID(Integer CATEGORIAID) {
        this.CATEGORIAID = CATEGORIAID;
    }
}
