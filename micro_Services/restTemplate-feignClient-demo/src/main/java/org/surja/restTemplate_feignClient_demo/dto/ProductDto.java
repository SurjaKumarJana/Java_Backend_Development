package org.surja.restTemplate_feignClient_demo.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {
    private Long id;

    private String name;

    private Double cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}