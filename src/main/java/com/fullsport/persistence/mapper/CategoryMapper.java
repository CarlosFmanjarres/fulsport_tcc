package com.fullsport.persistence.mapper;


import com.fullsport.domain.Category;
import com.fullsport.persistence.entity.CategoriaProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {


    @Mappings({
            @Mapping(source = "categoriaId",target = "categoryId"),
            @Mapping(source = "categoriaId",target = "categoryId"),
            @Mapping(source = "categoriaId",target = "categoryId")

    })
    Category toCategory(CategoriaProducto categoriaProducto);



}
