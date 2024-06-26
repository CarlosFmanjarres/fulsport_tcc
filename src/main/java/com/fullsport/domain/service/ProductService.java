package com.fullsport.domain.service;

import com.fullsport.domain.Product;
import com.fullsport.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<List<Product>> getByCategory(Integer categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Optional<List<Product>> getProduct(Integer PRODUCTID) {
        return productRepository.getProduct(PRODUCTID);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int PRODUCTID) {
        return getProduct(PRODUCTID).map(assetTypeDo -> {
            productRepository.delete(PRODUCTID);
            return true;
        }).orElse(false);
    }
}


