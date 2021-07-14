package com.api.ecommerce.service;

import com.api.ecommerce.dao.ProductRepository;
import com.api.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product create(Product product){
        repository.add(product);
        return product;
    }

    public Product update(Product product, Integer id){
        repository.update(product, id);
        return product;
    }

    public void delete(Integer id){
        repository.delete(id);
    }

    public List<Product> getList(){
        return repository.getList();
    }
}
