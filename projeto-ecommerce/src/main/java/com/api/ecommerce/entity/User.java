package com.api.ecommerce.entity;

import com.api.ecommerce.enums.PermitionEnum;

import java.util.ArrayList;
import java.util.List;

public class User {

    private boolean isAdmin;
    private String name;
    private Integer id;
    private List<Order> orderList;

    public User(boolean isAdmin, String name, Integer id, List<Order> orderList) {
        this.isAdmin = isAdmin;
        this.name = name;
        this.id = id;
        this.orderList = orderList;
    }

    public User(boolean isAdmin, String name, Integer id) {
        this.isAdmin = isAdmin;
        this.name = name;
        this.id = id;
        this.orderList = new ArrayList<>();
    }

    public User() {
        this.orderList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "isAdmin=" + isAdmin +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", orderList=" + orderList +
                '}';
    }
}
