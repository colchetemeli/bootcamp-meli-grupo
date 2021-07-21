package com.api.ecommerce.controller;

import com.api.ecommerce.entity.Order;
import com.api.ecommerce.entity.Product;
import com.api.ecommerce.service.OrderService;
import com.api.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody Order order, UriComponentsBuilder uriComponentsBuilder) {
        order = orderService.create(order);
        UriComponents uriComponents = uriComponentsBuilder.path("/{number}").buildAndExpand(order.getNumber());
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    @GetMapping
    public List<Order> listProducts() {
        return orderService.getList();
    }

}
