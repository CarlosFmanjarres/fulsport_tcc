package com.fullsport.persistence;

import com.fullsport.domain.Product;
import com.fullsport.domain.repository.ProductRepository;
import com.fullsport.persistence.crud.ProductoCrudRepository;
import com.fullsport.persistence.entity.Producto;
import com.fullsport.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(Integer categoryId) {
        List<Producto> productos = productoCrudRepository.findByCATEGORIAID(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getProduct(Integer PRODUCTID) {
        Optional<Producto> productos=productoCrudRepository.findById(PRODUCTID);
        return  productos.map(producto -> Collections.singletonList(mapper.toProduct(producto)));
    }

    @Override
    public Product save(Product product) {
        Producto producto= mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(Integer PRODUCTID) {
        productoCrudRepository.deleteById(PRODUCTID);
    }


}
