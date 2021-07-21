package com.api.ecommerce.dao;

import com.api.ecommerce.entity.Order;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private static final File FILE = new File("src/main/resources/orders.json");
    @Autowired
    private ObjectMapper mapper;

    public List<Order> getList() {
        List<Order> orders = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Order>> typeReference = new TypeReference<List<Order>>() {
            };
            orders = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return orders;
    }

    public void add(Order order) {
        try {
            List<Order> orders = getList();
            orders.add(order);
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, orders);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
