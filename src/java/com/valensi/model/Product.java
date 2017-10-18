/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    private Integer id;
    private String productName;
    private Double price;
    private String productInfo;

    public Product() {
    }

    public Product(Integer id, String productName, Double price, String productInfo) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.productInfo = productInfo;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the productInfo
     */
    public String getProductInfo() {
        return productInfo;
    }

    /**
     * @param productInfo the productInfo to set
     */
    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }
    
}
