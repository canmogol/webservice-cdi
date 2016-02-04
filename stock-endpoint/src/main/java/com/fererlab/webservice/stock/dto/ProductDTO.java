package com.fererlab.webservice.stock.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductDTO {

    private Integer id;
    private Integer stock;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
