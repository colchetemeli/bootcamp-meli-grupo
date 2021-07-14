package com.api.ecommerce.controller;

import com.api.ecommerce.entity.Product;
import com.api.ecommerce.service.ProductService;
import com.api.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestHeader Integer userId, @RequestBody Product product, UriComponentsBuilder uriComponentsBuilder){
        userService.auth(userId);
        product = productService.create(product);
        UriComponents uriComponents = uriComponentsBuilder.path("/products/{id}").buildAndExpand(product.getId());
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@RequestHeader Integer userId, @RequestBody Product product, @PathVariable Integer id){
        userService.auth(userId);
        return productService.update(product,id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@RequestHeader Integer userId, @PathVariable Integer id){
        userService.auth(userId);
        productService.delete(id);
    }

    @GetMapping
    public List<Product> listProducts(){
        return productService.getList();
    }

}
