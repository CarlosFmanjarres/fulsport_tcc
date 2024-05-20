package com.fullsport.domain.repository;

import com.fullsport.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(Integer categoryId);
    Optional<List<Product>> getProduct(Integer PRODUCTID);
    Product save(Product product);
    void  delete(Integer PRODUCTID );

}
