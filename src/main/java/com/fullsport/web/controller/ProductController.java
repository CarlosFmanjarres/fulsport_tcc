package com.fullsport.web.controller;


import com.fullsport.domain.Product;
import com.fullsport.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public ResponseEntity <List<Product>> getAll(){
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<Optional<List<Product>>> getByCategory(@PathVariable Integer categoryId) {
        return new ResponseEntity<>(productService.getByCategory(categoryId), HttpStatus.OK);
    }


    @GetMapping("/id/{productId}")
    public ResponseEntity<Optional<List<Product>>> getProduct(@PathVariable Integer productId){
        return new ResponseEntity<>(productService.getProduct(productId), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        Product savedProduct = productService.save(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{productId}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer productId){
        boolean result = productService.delete(productId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }




}
