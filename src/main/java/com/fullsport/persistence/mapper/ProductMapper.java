package com.fullsport.persistence.mapper;


import com.fullsport.domain.Product;
import com.fullsport.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
        @Mapping(source = "PRODUCTID", target = "PRODUCTID"),
        @Mapping(source = "NOMBRE", target = "NAME"),
        @Mapping(source = "DESCRIPCION", target = "DESCRIPTION"),
        @Mapping(source = "PRECIO", target = "PRICE"),
        @Mapping(source = "STOCK", target = "STOCK"),

    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

   @InheritInverseConfiguration
    @Mapping(target = "CATEGORIAID", ignore = true)
    @Mapping(target = "PROVEEDORID", ignore = true)
    Producto toProducto(Product product);

}
