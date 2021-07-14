package com.api.ecommerce.entity;

import java.util.List;

public class Product {

    private Integer id;
    private String name;
    private String description;
    private List<String> categorys;

    public Product(Integer id, String name, String description, List<String> categorys) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categorys = categorys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<String> categorys) {
        this.categorys = categorys;
    }

}
