package com.api.ecommerce.dao;

import com.api.ecommerce.entity.Product;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private static final File FILE = new File("src/main/resources/products.json");
    @Autowired
    private ObjectMapper mapper;

    public List<Product> getList() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>() {
            };
            products = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }

    public void add(Product product) {
        try {
            List<Product> products = getList();
            products.add(product);
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, products);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(Product product, Integer id) {
        try {
            List<Product> products = getList();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(id)) {
                    products.remove(i);
                    product.setId(id);
                    products.add(product);
                    break;
                }
            }
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, products);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try {
            List<Product> products = getList();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(id)) {
                    products.remove(i);
                    break;
                }
            }
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, products);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
