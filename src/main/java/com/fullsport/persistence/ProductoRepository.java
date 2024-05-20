package com.fullsport.persistence;

import com.fullsport.persistence.crud.ProductoCrudRepository;
import com.fullsport.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
       return (List<Producto>) productoCrudRepository.findAll();
    }

    public  List<Producto> getByCATEGORIAID(int CATEGORIAID){
        return productoCrudRepository.findByCATEGORIAID(CATEGORIAID);
    }

    public  Optional<Producto> getProducto(int PRODUCTID){
        return productoCrudRepository.findById(PRODUCTID);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete (int PRODUCTID){
        productoCrudRepository.deleteById(PRODUCTID);
    }


}
