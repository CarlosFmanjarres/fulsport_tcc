package com.fullsport.persistence.crud;

import com.fullsport.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository   extends CrudRepository<Producto,Integer> {

    List<Producto> findByCATEGORIAID(int CATEGORIAID);


}
