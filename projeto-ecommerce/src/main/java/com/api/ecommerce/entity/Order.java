package com.api.ecommerce.entity;

import java.util.List;

public class Order {

    private Integer number;
    private List<Product> productList;
    private Integer clientId;

    public Order(Integer number, List<Product> productList, Integer clientId) {
        this.number = number;
        this.productList = productList;
        this.clientId = clientId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
